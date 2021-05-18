(defrule get-interval-distance-upper "Returns distance between an interval"
    ; Get the name and inteval
    (requested-interval ?rname ?rinterval)
    ; Get the interval
    (interval ?distance ?rinterval)
    ; Get the names and the numbers of the notes
    (note ?rname ?number1)
    (note ?notename ?number2)
    ; Check the interval
    (test (eq (- ?number2 ?number1) ?distance))
    =>
    ; Deducting interval
    (assert (response-note-upper (note ?notename)))
)
(defrule get-interval-distance-lower "Returns distance between an interval"
    ; Get the name and inteval
    (requested-interval ?rname ?rinterval)
    ; Get the interval
    (interval ?distance ?rinterval)
    ; Get the names and the numbers of the notes
    (note ?rname ?number1)
    (note ?notename ?number2)
    ; Check the interval
    (test (eq (- ?number1 ?number2) ?distance))
    =>
    ; Deducting interval
    (assert (response-note-lower (note ?notename)))
)