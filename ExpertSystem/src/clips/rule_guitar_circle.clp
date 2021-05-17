(defrule get-guitar-circle ""
    ; Base note
    (requested-note ?base)
    ; Get the names and the numbers of the notes
    (note ?base ?num1)
    (note ?note2 ?num2)
    (note ?note5 ?num5)
    (note ?note6 ?num6)
    ; Compute distances
    (test (or (eq (- ?num2 ?num1) 2) (eq (- ?num2 ?num1) -10)))
    (test (or (eq (- ?num5 ?num1) 7) (eq (- ?num5 ?num1) -5)))
    (test (or (eq (- ?num6 ?num1) 9) (eq (- ?num6 ?num1) -3)))
    =>
    (assert
        (response-guitar-circle
            (vi ?note6)
            (ii ?note2)
            (V ?note5)
            (I ?base)
        )
    )
)