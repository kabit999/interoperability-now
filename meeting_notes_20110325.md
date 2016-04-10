**Present:** Sven, Micah, Chase

**Apologies:** Derek, Gabor, Yan, Russ, Peter

**Resource Naming and Package Organization**

This call was fairly technical and dealt with details of how the Xliff:doc content should reference other files in the package, which digressed into a discussion of package structure.  Since there was a lot of back-and-forth in this discussion, this is a summary of issues touched upon:

  * Are relative paths sufficient?  Consensus is 'yes', but this gets into issues of package structure.
    * Nobody much likes having xliff content off in its own subdirectory and have every path begin with "..".
    * Content often comes out of a CMS in little chunks, and this content may be packaged for use in preview.  Would the package producer be responsible for organizing this content into some sort of hierarchy?  (Hopefully not?)
    * Separating out content from resources used in preview can become complex, because those resources may be referenced (in HTML, say) via relative paths that do not match package structure -- they would need to be rewritten.
  * Is the proposed TIP structure (input/output folders) practical?  Several observations:
    * Having an input/output distinction makes it easy to specify processing behavior: anything in input/ eventually needs to make its way to output/ via some process for the localization to be complete.
    * XLIFF is valid in any state; Micah argues that it could simply live in the package root and would not require input/output distinction.
    * But what is true for XLIFF may not be true for other translatable content formats.
  * A discussion of separating out resources that are localizable from those that are not:
    * This could be done at the folder level (folders for "other", "other\_source", "other\_target")
    * This could also be done by adding metadata to the manifest file
  * There seems to be some consensus for adding a "localizable" flag to entries in the manifest.  However, input/output folders are still required to handle non-bilingual files.

**Action Items**
  * The discussion made us realize that we need better-defined use cases for some of these things.  Sven has asked his own developers to assist with this.
  * Chase to look at Micah's xliff:doc samples and try to solve the dx: namespace mystery.
  * Chase to also work on a HTML file sample (including external sources such as CSS, image, etc) to complement the DITA-based samples Micah has been working with.

**Next Meeting**
  * The next meeting is tentatively scheduled for April 8, 2011.