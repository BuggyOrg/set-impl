(defco set/add [set item] set)
;(defco set/cons [] 42); we should fix lisgy!
(defco set/cons [] (math/inc 0))

(set/add (set/cons) 3)