package org.jetbrains.dukat.ast.model

data class TypeDeclaration(
        val value: String,
        val params: List<ParameterValue>,
        override var nullable: Boolean = false,
        override var vararg: Boolean = false,
        override var meta: ParameterValue? = null
) : ParameterValue {
    constructor(value: String, params: Array<ParameterValue>) : this(value, params.toList())
}