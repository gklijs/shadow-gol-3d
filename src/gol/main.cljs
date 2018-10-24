(ns gol.main
   ( :require ["game-of-life-3d" :as gol]))

(def uni (gol/Universe. 10 10 10))

(defn tick
  "tick"
  []
  (.tick uni))
