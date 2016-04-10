**Present:** Sven, Micah, Gabor, Chase, Russ

**Apologies:** Derek, Yan, Peter

**'Interoperability-September'**
  * We will do a 3-tool demo at TM-Europe in September, showing both TIP and xliff:doc (aka "The Full Monty"), although which features of the xliff:doc to show are TBD.
  * Sven proposes doing shared (virtual) development sessions at two points during the summer, once to share/discuss TIP implementations, once for xliff:doc.

**MemoQFest Panel Recap**
  * There was a very lively discussion and lots of good interaction with the audience.
  * Audience questions about whether SDL should be involved and on what timeframe.
  * The XLIFF TC is following this work closely and is interested in more communication.
  * Questions about what process we would potentially follow to standardize the work.
  * Questions about differences between this work and Lommel/Melby work -- based on our readings, they seem to be aiming for something a little different.
  * The W3C has programs for groups that are not necessarily producing standards, but want to make sure their work could be leveraged for standards in the future.  Richard Ishida is sending Sven further info.

**Peanut Butter**
  * Chase sent out sample xliff:doc files based on a simplified version of the wikipedia page for peanut butter.  It is not in TIP format and does not do anything about the subflows needed to handle @title attributes on hyperlinks.  The next iteration will try to handle both of these things.

**Spec Discussion**
  * Skeletons: This came up during the peanut butter discussion.  We had previously agreed not to use them, but to be xliff-compliant the attribute is expected.
    * Revised decision: keep them for XML and HTML files, ignore them for other formats, where their use is debatable and we expect implementations to degrade to just using xliff:doc + XSLT.
    * The '%%%#%%%' syntax for skeleton substitutions comes from Heartsome.  We can do something different if we need to.
  * Subflows: What is going on here?  XLIFF supports them but is very vague in how to use the elements/attributes.
    * We will probably not demo these in September, but we can work through the methodology using samples.
    * Additional discussion of using Unicode private range characters, which Chase & Sven do not like.
  * XSLT preview
    * Micah is still unclear on some of the particulars.  Sven to start work on an example based on PB.
  * `@orig-markup-*` and `equiv-markup-*`: This came up when building the PB example.
    * Micah will update the spec to include the proposal that if `equiv-markup-*` is not found, processors fall back on `orig-markup-*`.

**Misc**
  * We need an issue tracking system, and a version control system for various things we are producing.  Chase to take point.

**Action Items**
  * Draft project plan for TM-Europe demonstration and associated development (Peter was volunteered in his absence!  Russ can also assist)
  * Add to orig-markup and preview markup: if orig markup is HTML, ok to just include that. May want to include preview markup anyway, if the HTML could possibly interfere. (Micah)
  * Work on list of what parts of xliff:doc are needed to be coded up by TM:Europe (prioritization) (Micah)
  * Provide marketing materials we can use in demonstrations, in xml, indesign, html, etc. formats. (Sven)
  * Sign up for the mailing list:
http://mail.interoperability-now.org/mailman/listinfo/core_interoperability-now.org (everyone!)
  * Investigate SCM/issue tracking options (Chase)
  * Next rev of the peanut butter example (Chase, Sven working on preview)