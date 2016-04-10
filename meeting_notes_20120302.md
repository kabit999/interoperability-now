**Attendees:** Sven, Micah, Chase, Joerg

## Action Items ##
  * Get and submit LocWorld speaker bios + pics from Kilgray, XTM by March 2 (Micah)
  * Integrate comments on 1.4 draft into a new version by March 14 (Chase)
    * Settle on new names for tasks
    * Add conformance/compatibility section

## Notes ##
  * Discussion focused on the new [TIPP 1.4 draft](http://code.google.com/p/interoperability-now/source/browse/trunk/tip/The_TMS_Interoperability_Protocol_Package.docx) ([r121](https://code.google.com/p/interoperability-now/source/detail?r=121))
  * Does 'level of interoperability' need to be a separate piece of metadata, or can it be folded in to task?
    * Micah had proposed this over email, arguing that it's conflating two separate things
    * Joerg: in the Translate case, the underlying bilingual format is really what this boils down to (XLIFF:doc vs XLIFF vs nothing)
    * Joerg: this also comes back to the question of how interoperability is defined?
  * Custom tasks - what are the standards for interoperability?
    * Micah: we need guidelines.  Encourage open formats, things that are working towards standards, interoperable formats
      * Chase: this again comes back to how "interoperable" is defined
  * Should we be arbiters and "rate" the compatibility/interoperability of tasks that are submitted by third parties?
    * There is general support for this idea.  Sven notes: I wouldn't want people to be able to rate things themselves.
    * Micah: For most tasks people submit, there will only be one level anyways
  * Spec needs a section on conformance/compatibility
  * Existing tasks need to be renamed somehow to make them clearer.
    * (On the followup call with Alan and Arle, Alan points out that the term "Bilingual" is confusing, and "Bitext" should be used instead.)
  * Joerg: What about a translate task that wants to have updates applied to TM/TB
    * Sven: I think these are beyond the core focus, as they are human actions
    * Micah: Some combination of STS and custom task types can handle this
  * Does the STS slot need to be first-level (required for all task types), as opposed to left up to the task type?  It's an open question.  We'll see what Alan says as well.
  * Micah: What about sequential tasks ("Translate this, then do something else, then something else.")  Do we allow multiple task elements in a single TIPP?
    * We all agree this is a bad idea.
  * Multilingual packages
    * We need to move on this.
    * Part of the same spec, or something different?
      * Micah: from a marketing standpoint, keeping it to two specs rather than 3 is good
    * Desire to keep the multilingual wrapper as simple as possible.  Possibly nothing other than a wrapper zip with TIPPs using some name convention to indicate locale pair
  * Minor stuff
    * Sven: avoid the word "loose", it's too similar to "lose" for non-native English speakers