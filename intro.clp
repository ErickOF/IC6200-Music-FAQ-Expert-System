; Incluir algunos elemtnos
(deftemplate urgencia (slot tipo))
(deftemplate respuesta (slot accion))

;
(defrule urgencia-incendio
    (urgencia (tipo incendio))
    =>
    (assert (respuesta
        (accion activar-sistema-acntiincendio))
    )
)

(deffacts urgencia(tipo incendio))
(list-deftemplates)
(list-defrules)
(list-deffacts)

