(defrule get-major-scale "Returns major scalen base on a given note"
    ; Base note
    (requested-note ?base)
    ; Get the names and the numbers of the notes
    (note ?base ?num1)
    (note ?note2 ?num2)
    (note ?note3 ?num3)
    (note ?note4 ?num4)
    (note ?note5 ?num5)
    (note ?note6 ?num6)
    (note ?note7 ?num7)
    ; Compute distances
    (test (or (eq (- ?num2 ?num1) 2) (eq (- ?num2 ?num1) -10)))
    (test (or (eq (- ?num3 ?num1) 4) (eq (- ?num3 ?num1) -8)))
    (test (or (eq (- ?num4 ?num1) 5) (eq (- ?num4 ?num1) -7)))
    (test (or (eq (- ?num5 ?num1) 7) (eq (- ?num5 ?num1) -5)))
    (test (or (eq (- ?num6 ?num1) 5) (eq (- ?num6 ?num1) -3)))
    (test (or (eq (- ?num7 ?num1) 3) (eq (- ?num7 ?num1) -1)))
    =>
    ;(printout t ?base ?note2 ?note3 ?note4 ?note5 ?note6 ?note7 crlf)
    ;(printout t ?base ?note2 ?note3 ?note4 ?note5 ?note6 ?note7 ?note8 crlf)
    (assert 
        (response-scale
            (i   ?base)
            (ii  ?note2)
            (iii ?note3)
            (iv  ?note4)
            (v   ?note5)
            (vi  ?note6)
            (vii ?note7)
            ;(viii ?note8)
        )
    )
)