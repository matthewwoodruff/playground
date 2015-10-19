(ns clojure-noob.core
  (:gen-class))

(defn listNames
  "List names"
  [& names]
  (println names))

(defn functions
  "A bunch of functions"
  []
  (and 1 2)
  (or nil true)
  (inc 1)
  (map inc [1 2 3])
)

(defn overloading
  "Some overloading stuff"
  ([one]
    (println "One arg")
  )
  ([one two]
    (println "Two args")
  )
)

(defn vectorDestruction
  [[first]]
  (println first)
)

(defn mapDestruction
  [{name :name location :location}]
  (println (str "Hello " name " from " location))
)

(defn mapDestruction2
  [{:keys [name location]}]
  (mapDestruction {:name name :location location})
)

(defn mapExtraction
  [{:keys [name location] :as aMap}]
  (mapDestruction aMap)
)

(defn anonymousFunc
  []
  ((fn
    [& args]
    (println args)
  ) [1 2 3])
)

(defn looper
  [n]
  (loop [i 0]
    (println (str "iteration " i))
    (if (> i n)
      (println "Goodbye")
      (recur (inc i))
    )
  )
)

(defn anonymousFunc2
  [& args]
  (map #(str "Hi, " %1 ", how are you? " %2) args args)
)

(defn anonymousFunc3
  [& args]
  (#(str "hello " %&) "wer" "tyu")
)

(defn returnsFunc
  [value]
  #(+ % value)
)

(def customFunc (returnsFunc 3))

(defn regexCheck
  [text]
  (re-find #"^http://[A-z]*.com$" (:name text))
)

(defn myMethod
  "testing clojure stuff"
  [one]
  (println (str "just one arg " one))
  (if (= one "ok")
    (do (println "if statement true"))
    (do (println "if statement false"))
  )
  (when (= one "ok")
    (do (println "when statement executed"))
  )
  (def anInt 1)
  (def aDouble 1.2)
  (def aRatio 1/2)

  ; Sets
  (def aSet #{1 2 3})
  (def newSet (set 1 2 2 3))
  (def hashSet (hash-set 1 2 2 3))
  (def sortedSet (sorted-set 1 4 3 3 2))
  (get aSet 1)

  ; Lists
  (def aList '(1 2 3))
  (def newList (list 1 2 3))
  (nth aList 2)
  (conj aList 4)

  ; Vectors
  (def aVector [1 2 3])
  (def newVector (vector 1 2 3))
  (get aVector 2) ; doesn't work on lists
  (first aVector)
  (last aVector)
  (nth aVector 2)

  ; Maps
  (def aMap {:a 1 :b 2 :c {:a 3}})
  (def hashMap (hash-map :a 1 :b 2))
  (get aMap :a)
  (aMap :a)
  (:a aMap)
  (get-in aMap [:c :a])
  (:d aMap (str "default value as :d doesn't exist in " 'aMap))

  ; Let - define variables for use in new scope
  (let [[head & tail] [1 2 3]] head) ; => 1
  (let [{:keys [name location]} {:name "Matt" :location "Sheff"}] name)

  ; Reduce
  (reduce + (1 2 3 4))
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!")
  (listNames "Matt" "Phil"))

; Functions


(defn listToMap
  [val]
  (into {} val)
)
