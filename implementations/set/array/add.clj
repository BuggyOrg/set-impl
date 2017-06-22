(defco set_array_add [set value]
    (if (array/contains set value)
        set
        (array/push set value)
    )
)
