# From the TextMate Grammar:
## Meta.embedded.block.js, meta.embedded.block.css, meta.embedded.block.html, string.quoted:
### injection
#### raw_tag

#### comment_block
#### object
#### tag_injection
## Core
### raw_tag
### doc_tag
### comment_block
### style_codefence
### stylesheet_codefence
### json_codefence
### javascript_codefence
### object
### tag
### text.html.basic


# LOOKBEHINDS
You can do a lookbehind w/ .flex files by doing yypushback(). For example: 
"|\s*[a-zA-Z][a-zA-Z]*"
Then pushback the non-pipe-or-space characters, set the state to "In Filter" or something like that