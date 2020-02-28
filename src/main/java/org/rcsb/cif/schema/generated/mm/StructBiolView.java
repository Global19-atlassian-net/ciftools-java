package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_BIOL_VIEW category record details
 * about how to draw and annotate an informative view of the
 * biological structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructBiolView extends DelegatingCategory {
    public StructBiolView(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return delegate.getColumn("biol_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of this view of the biological
     * structure.
     * 
     * This data item can be used as a figure legend.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_biol_view.id must uniquely identify a
     * record in the STRUCT_BIOL_VIEW list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix11() {
        return delegate.getColumn("rot_matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix12() {
        return delegate.getColumn("rot_matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix13() {
        return delegate.getColumn("rot_matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix21() {
        return delegate.getColumn("rot_matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix22() {
        return delegate.getColumn("rot_matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix23() {
        return delegate.getColumn("rot_matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix31() {
        return delegate.getColumn("rot_matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix32() {
        return delegate.getColumn("rot_matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix33() {
        return delegate.getColumn("rot_matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * translation vector
     * @return FloatColumn
     */
    public FloatColumn getPdbxVector1() {
        return delegate.getColumn("pdbx_vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * translation vector
     * @return FloatColumn
     */
    public FloatColumn getPdbxVector2() {
        return delegate.getColumn("pdbx_vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * translation vector
     * @return FloatColumn
     */
    public FloatColumn getPdbxVector3() {
        return delegate.getColumn("pdbx_vector[3]", DelegatingFloatColumn::new);
    }
}