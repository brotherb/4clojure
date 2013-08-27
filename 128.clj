(fn [str]
  (let [suit (first str)
        rank (second str)
        suittable {\D :diamond,\H :heart,\C :club,\S :spade}
        ranktable {\2 0,\3 1,\4 2,\5 3,\6 4,\7 5,\8 6,\9 7,\T 8,\J 9,\Q 10,\K 11,\A 12}]
    (assoc {} :suit (suittable suit) :rank (ranktable rank))))