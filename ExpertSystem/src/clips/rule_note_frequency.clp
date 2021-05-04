(defrule get-note-frequency "Returns note frequency base on the note"
    ; Check the name of the requested note and store the scale
    (requested-note C|C#|Db|D|D#|Eb|E|Fb|F|F#|Gb|G|G#|Ab|A|A#|Bb|B ?rscale)
    ; Check the scale of the requested note and store the name
    (requested-note ?rname 0|1|2|3|4|5|6|7|8)
    ; Check if the name of the requested note is equal to any learnt note
    ; Store the number representing the note
    (note ?rname ?number)
    =>
    ; Compute the frequency
    (assert (response-frequency (frequency (get-frequency ?number ?rscale))))
)

;(clear)
;(load facts.clp)
;(load functions.clp)
;(load rules.clp)
;(request)
;(assert (request-note name scale))
;(run)
; Result
