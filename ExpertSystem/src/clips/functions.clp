(deffunction get-frequency (?note ?scale)
    ; Equation to compute the frequency
    ; 55 * (2)^(i - 1) * ((2)^(1 / 12))^k
    (* 55 (* (** 2 (- ?scale 1)) (** (** 2 (/ 1 12)) ?note)))
)
