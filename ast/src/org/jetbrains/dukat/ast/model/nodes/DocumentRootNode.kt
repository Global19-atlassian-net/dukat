package org.jetbrains.dukat.ast.model.nodes

import org.jetbrains.dukat.ast.model.QualifierKind
import org.jetbrains.dukat.astCommon.NameEntity
import org.jetbrains.dukat.astCommon.TopLevelEntity
import org.jetbrains.dukat.tsmodel.DefinitionInfoDeclaration

data class DocumentRootNode(
        val fileName: String,

        var packageName: NameEntity,
        val declarations: List<TopLevelEntity> = emptyList(),
        val imports: Map<String, ImportNode>,
        val definitionsInfo: List<DefinitionInfoDeclaration>,

        var owner: DocumentRootNode?,
        var uid: String,

        var qualifiedNode: NameEntity?,
        var qualifierKind: QualifierKind
) : TopLevelEntity
