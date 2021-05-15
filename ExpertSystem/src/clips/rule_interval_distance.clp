(defrule get-interval-distance "Returns distance between an interval"
    ; Check the name of the second note and store the name of the first one
    (requested-interval ?rname1 C|C#|Db|D|D#|Eb|E|Fb|F|F#|Gb|G|G#|Ab|A|A#|Bb|B)
    ; Check the name of the first note and store the name of the second one
    (requested-interval C|C#|Db|D|D#|Eb|E|Fb|F|F#|Gb|G|G#|Ab|A|A#|Bb|B ?rname2)
    ; Get the names and the numbers of the notes
    (note ?rname1 ?number1)
    (note ?rname2 ?number2)
    ; Get the interval
    (interval ?inumber ?iname)
    (test (eq (abs (- ?number2 ?number1)) ?inumber))
    =>
    ; Deducting interval
    (assert (response-distance (distance ?iname)))
)