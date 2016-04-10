**Attendees**: Sven, Micah, Peter, and Chase

## Linport ##
  * Discussion on next steps

## Next milestone ##
  * The plan is to prepare another draft of both specifications by November 18.

### Issues to resolve: ###
  * Multilingual package strategy proposal - it would be nice to get some agreement by next Friday
  * How to handle the issue of JAXB barfing on the preferred xliff:doc schema style
  * TIPP: how should processors handle files in input/ that they don't know how to process?
  * Restrictions on merging and splitting - are these a good idea?
  * Xliff:doc: Do we need new origin fields for "copy source to target" or "pseudo-translate"?

### Additional notes ###
  * Multilingual TIPPs:
    * Micah's proposal called for bilingual TIPPs and a ML wrapper
    * Joerg wants multilingual TIPPs, Micah doesn't think it can be done cleanly
  * TIPP Spec: Chase has minor revisions to make based on Yves feedback, other outstanding things from earlier reviews
  * Xliff:doc schema: we have two versions.  How to resolve?
    * Original, preferred version.  JAXB doesn't like this one because it has multiple redefines of the same element.
    * Hacked version for JAXB.
  * TIPP: What if the processing app can't handle a file in input?  What is the expected behavior?  Can this tool never be TIPP-compliant?
    * Right now, no way to indicate states other than moving the file to output
  * Merging and Splitting - issues raised by Shirley Coady
    * An upstream package that prevented merging would cause problems for a paragraph-level tool like Multicorpora downstream
      * What if a tool provider hardcoded this restriction as opposed to exposing it to the user?  That tool could never work with Multicorpora downstream.
    * Why would you ever want to prevent splitting?
      * File-format specific problems when segments are split automatically
      * Some phrases may change meaning when split
    * Sven: different tools have different split/merge behavior.  What can we guarantee?
  * Planning for the next release
    * Discussion of talking to tool providers -- need to talk to Alan
    * Need to decouple technical discussions from IN/Linport discussions