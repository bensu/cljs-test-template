# cljs-test-template 

A Leiningen template to start testing ClojureScript apps.

## Usage

    lein new cljs-test hello-world --snapshot 

## Next Steps

1. Support other testing environments like Node.js or Zombie.js
2. Add source maps to those environments that support them.

## Running the tests inside the template

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
    phantomjs vendor/test/unit-test.js vendor/test/phantomjs-shim.js target/testable.js 

## Feedback

Pull requests, issues, and feedback welcome.

## License

Copyright © 2015 Sebastian Bensusan 

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
