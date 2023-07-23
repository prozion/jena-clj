(defproject org.clojars.prozion/jena-clj "0.2.1"
  :description "An idiomatic Clojure wrapper to the Jena API"
  :url "https://github.com/prozion/jena-clj"
  :repositories {"mvnrepository" {:url "https://mvnrepository.com/"}
                 "jenarepo" {:url "https://repository.apache.org/content/repositories/releases/"}}
  :license {:name "GNU General Public License v3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 ; [org.apache.jena/jena-core "3.2.0"]
                 [org.apache.jena/jena-arq "3.2.0"]
                 [org.apache.jena/jena-iri "3.2.0"]
                 [org.apache.jena/jena-tdb "3.2.0"]
                 [org.clojars.prozion/odysseus "0.1.9"]
                 ]
  ; :main ^:skip-aot sparql.core
  :main ^:skip-aot jena-clj.triplestore
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
