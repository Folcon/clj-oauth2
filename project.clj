(defproject clj-oauth2 "0.0.1-SNAPSHOT"
  :description "clj-http and ring middlewares for OAuth 2.0"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [clj-http "0.1.3"]]

  :dev-dependencies [[org.clojure/clojure "1.2.1"]
                     [org.clojure/clojure-contrib "1.2.0"]
                     [clj-http "0.1.3"]
                     [ring "0.3.11"]
                     [swank-clojure "1.4.0-SNAPSHOT"] ;; meh
                     [com.stuartsierra/lazytest "1.1.2"]]

  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"
                 "java" "http://download.java.net/maven/2"}

  :aot [clj-oauth2.OAuth2Exception clj-oauth2.OAuth2StateMismatchException])