(defproject com.novemberain/pantomime "1.3.0-beta1"
  :min-lein-version "2.0.0"
  :description "A tiny Clojure library that deals with MIME types"  
  :license { :name "Eclipse Public License" }
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.apache.tika/tika-core "1.1"]]
  :profiles {:dev { :resource-paths ["test/resources"]}
             :1.4 { :dependencies [[org.clojure/clojure "1.4.0-beta4"]] }}
  :aliases  { "all" ["with-profile" "dev:dev,1.4"] }
  :warn-on-reflection true)
