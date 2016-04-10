# Introduction #

Version 1.5 of the TIPP format was released on March 1, 2013.
  * The specification and reference guide is [available for download](https://code.google.com/p/interoperability-now/downloads/detail?name=The_TMS_Interoperability_Protocol_Package-1.5.pdf&can=2&q=) on the Downloads page or the Interoperability Now! home page.
  * The schema are also [available for download](https://code.google.com/p/interoperability-now/downloads/detail?name=TIPP%20Schema%201.5.zip&can=2&q=) on the Downloads page and the Interoperability Now! home page.
  * The schema are also permanently hosted at http://schema.interoperability-now.org/tipp/1_5/:
    * [TIPPManifest.xsd](http://schema.interoperability-now.org/tipp/1_5/TIPPManifest.xsd)
    * [TIPPCommon.xsd](http://schema.interoperability-now.org/tipp/1_5/TIPPCommon.xsd)
  * Updates to the [jtip](jtip.md) reference implementation are currently in progress in subversion ([/tip/jtip](https://code.google.com/p/interoperability-now/source/browse/#svn%2Ftrunk%2Ftip%2Fjtip)).

# What's new in TIPP 1.5 #

Most of the changes in TIPP 1.5 are the result of our ongoing work with the [Linport Project](http://linport.org).
  * The completely free-form section model of version 1.4 has been dialed back to a more restrained approach.  Valid section types are now enumerated by the schema as distinct elements.  Custom task types should either use an existing section type, or place files within a reserved "Extras".  Task types can still specify whether a given section type is required or optional for a that task, as well as what behavior is expected concerning its contents.
  * Additional response messages have been added, replacing the single "Failure" value with several possible failure modes.
  * New section types for terminology and metrics data.
  * Rewritten language on compliance.
  * Optional XML-DSIG support for digitally signing the manifest and payload contents.
  * Many clarifications and corrections to the text of the specification itself.