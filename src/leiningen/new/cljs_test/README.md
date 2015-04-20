# {{name}}

FIXME: Write a one-line description of your library/project.

## Overview

FIXME: Write a paragraph about the library/project and highlight its goals.

## Setup

Note: auto is not currently working. cljs.test doesn't have a
`on-test-done` hook, so it is hard to determine when did the async
test ended. You can disable the `notify-command` in `project.clj` and
run the tests manually.

To run the tests on auto compile:

    lein cljsbuild auto slimer

or

    lein cljsbuild auto phantom

If you want to run tests once:

    lein cljsbuild once slimer
    lein cljsbuild once phantom

or if the file is already compiled you can call the runners directly:

    slimerjs vendor/test/unit-test.js target/testable.js 
    phantomjs vendor/test/unit-test.js vendor/test/phantomjs-shims.js target/testable.js 

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
