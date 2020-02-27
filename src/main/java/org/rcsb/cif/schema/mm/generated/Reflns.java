package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFLNS category record details about the
 * reflection data used to determine the ATOM_SITE data items.
 * 
 * The REFLN data items refer to individual reflections and must
 * be included in looped lists.
 * 
 * The REFLNS data items specify the parameters that apply to all
 * reflections. The REFLNS data items are not looped.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Reflns extends BaseCategory {
    public Reflns(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Reflns(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Reflns(String name) {
        super(name);
    }

    /**
     * The value of the overall isotropic displacement parameter
     * estimated from the slope of the Wilson plot.
     * @return FloatColumn
     */
    public FloatColumn getBIsoWilsonEstimate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso_Wilson_estimate", FloatColumn::new) :
                getBinaryColumn("B_iso_Wilson_estimate"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A description of special aspects of the data-reduction
     * procedures.
     * @return StrColumn
     */
    public StrColumn getDataReductionDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_reduction_details", StrColumn::new) :
                getBinaryColumn("data_reduction_details"));
    }

    /**
     * The method used for data reduction.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the data-reduction programs.
     * @return StrColumn
     */
    public StrColumn getDataReductionMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_reduction_method", StrColumn::new) :
                getBinaryColumn("data_reduction_method"));
    }

    /**
     * The smallest value for the interplanar spacings for
     * the reflection data. This is called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResolutionHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_resolution_high", FloatColumn::new) :
                getBinaryColumn("d_resolution_high"));
    }

    /**
     * The largest value for the interplanar spacings for the
     * reflection data. This is called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResolutionLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_resolution_low", FloatColumn::new) :
                getBinaryColumn("d_resolution_low"));
    }

    /**
     * A description of reflection data not covered by other data
     * names. This should include details of the Friedel pairs.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Maximum value of the Miller index h for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_h_max.
     * @return IntColumn
     */
    public IntColumn getLimitHMax() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_h_max", IntColumn::new) :
                getBinaryColumn("limit_h_max"));
    }

    /**
     * Minimum value of the Miller index h for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_h_min.
     * @return IntColumn
     */
    public IntColumn getLimitHMin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_h_min", IntColumn::new) :
                getBinaryColumn("limit_h_min"));
    }

    /**
     * Maximum value of the Miller index k for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_k_max.
     * @return IntColumn
     */
    public IntColumn getLimitKMax() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_k_max", IntColumn::new) :
                getBinaryColumn("limit_k_max"));
    }

    /**
     * Minimum value of the Miller index k for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_k_min.
     * @return IntColumn
     */
    public IntColumn getLimitKMin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_k_min", IntColumn::new) :
                getBinaryColumn("limit_k_min"));
    }

    /**
     * Maximum value of the Miller index l for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_l_max.
     * @return IntColumn
     */
    public IntColumn getLimitLMax() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_l_max", IntColumn::new) :
                getBinaryColumn("limit_l_max"));
    }

    /**
     * Minimum value of the Miller index l for the reflection data. This
     * need not have the same value as _diffrn_reflns.limit_l_min.
     * @return IntColumn
     */
    public IntColumn getLimitLMin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_l_min", IntColumn::new) :
                getBinaryColumn("limit_l_min"));
    }

    /**
     * The total number of reflections in the REFLN list (not the
     * DIFFRN_REFLN list). This number may contain Friedel-equivalent
     * reflections according to the nature of the structure and the
     * procedures used. The item _reflns.details describes the
     * reflection data.
     * @return IntColumn
     */
    public IntColumn getNumberAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_all", IntColumn::new) :
                getBinaryColumn("number_all"));
    }

    /**
     * The number of reflections in the REFLN list (not the DIFFRN_REFLN
     * list) classified as observed (see _reflns.observed_criterion).
     * This number may contain Friedel-equivalent reflections according
     * to the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberObs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_obs", IntColumn::new) :
                getBinaryColumn("number_obs"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'. This
     * criterion is usually expressed in terms of a sigma(I) or
     * sigma(F) threshold.
     * @return StrColumn
     */
    public StrColumn getObservedCriterion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("observed_criterion", StrColumn::new) :
                getBinaryColumn("observed_criterion"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as an upper limit for the value of F.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionFMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("observed_criterion_F_max", FloatColumn::new) :
                getBinaryColumn("observed_criterion_F_max"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a lower limit for the value of F.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionFMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("observed_criterion_F_min", FloatColumn::new) :
                getBinaryColumn("observed_criterion_F_min"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as an upper limit for the value of I.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionIMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("observed_criterion_I_max", FloatColumn::new) :
                getBinaryColumn("observed_criterion_I_max"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a lower limit for the value of I.
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionIMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("observed_criterion_I_min", FloatColumn::new) :
                getBinaryColumn("observed_criterion_I_min"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a multiple of the value of sigma(F).
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionSigmaF() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("observed_criterion_sigma_F", FloatColumn::new) :
                getBinaryColumn("observed_criterion_sigma_F"));
    }

    /**
     * The criterion used to classify a reflection as 'observed'
     * expressed as a multiple of the value of sigma(I).
     * @return FloatColumn
     */
    public FloatColumn getObservedCriterionSigmaI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("observed_criterion_sigma_I", FloatColumn::new) :
                getBinaryColumn("observed_criterion_sigma_I"));
    }

    /**
     * The percentage of geometrically possible reflections represented
     * by reflections that satisfy the resolution limits established
     * by _reflns.d_resolution_high and _reflns.d_resolution_low and
     * the observation limit established by
     * _reflns.observed_criterion.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("percent_possible_obs", FloatColumn::new) :
                getBinaryColumn("percent_possible_obs"));
    }

    /**
     * A description of the method by which a subset of reflections was
     * selected for exclusion from refinement so as to be used in the
     * calculation of a 'free' R factor.
     * @return StrColumn
     */
    public StrColumn getRFreeDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("R_free_details", StrColumn::new) :
                getBinaryColumn("R_free_details"));
    }

    /**
     * Residual factor Rmerge for all reflections that satisfy the
     * resolution limits established by _reflns.d_resolution_high
     * and _reflns.d_resolution_low.
     * 
     * sum~i~(sum~j~|F~j~ - &lt;F&gt;|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~&lt;F&gt;)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * &lt;F&gt;  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_F_all", FloatColumn::new) :
                getBinaryColumn("Rmerge_F_all"));
    }

    /**
     * Residual factor Rmerge for reflections that satisfy the
     * resolution limits established by _reflns.d_resolution_high
     * and _reflns.d_resolution_low and the observation limit
     * established by _reflns.observed_criterion.
     * 
     * sum~i~(sum~j~|F~j~ - &lt;F&gt;|)
     * Rmerge(F) = --------------------------
     * sum~i~(sum~j~&lt;F&gt;)
     * 
     * F~j~ = the amplitude of the jth observation of reflection i
     * &lt;F&gt;  = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection
     * @return FloatColumn
     */
    public FloatColumn getRmergeFObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Rmerge_F_obs", FloatColumn::new) :
                getBinaryColumn("Rmerge_F_obs"));
    }

    /**
     * The proportion of Friedel-related reflections present in
     * the number of  'independent' reflections specified by
     * the item _reflns.number_all.
     * 
     * This proportion is calculated as the ratio:
     * 
     * [N(Crystal class) - N(Laue symmetry)] / N(Laue symmetry)
     * 
     * where, working from the DIFFRN_REFLN list,
     * 
     * N(Crystal class) is the number of reflections obtained on
     * averaging under the symmetry of the crystal class
     * N(Laue symmetry) is the number of reflections obtained on
     * averaging under the Laue symmetry.
     * 
     * Examples:
     * (a) For centrosymmetric structures, the value of
     * _reflns.Friedel_coverage is
     * necessarily equal to 0.0, as the crystal class
     * is identical to the Laue symmetry.
     * (b) For whole-sphere data for a crystal in the space
     * group P1, _reflns.Friedel_coverage is equal to 1.0,
     * as no reflection h k l is equivalent to -h -k -l
     * in the crystal class and all Friedel pairs
     * {h k l; -h -k -l} have been measured.
     * (c) For whole-sphere data in space group Pmm2,
     * _reflns.Friedel_coverage
     * will be &lt; 1.0 because although reflections h k l and
     * -h -k -l are not equivalent when h k l indices are
     * nonzero, they are when l=0.
     * (d) For a crystal in space group Pmm2, measurements of the
     * two inequivalent octants h &gt;= 0, k &gt;=0, l lead to the
     * same value as in (c), whereas measurements of the
     * two equivalent octants h &gt;= 0, k, l &gt;= 0 will lead to
     * a zero value for _reflns.Friedel_coverage.
     * @return FloatColumn
     */
    public FloatColumn getFriedelCoverage() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Friedel_coverage", FloatColumn::new) :
                getBinaryColumn("Friedel_coverage"));
    }

    /**
     * The number of reflections in the REFLN list (not the
     * DIFFRN_REFLN list) that are significantly intense, satisfying
     * the criterion specified by _reflns.threshold_expression. This may
     * include Friedel-equivalent reflections (i.e. those which are
     * symmetry-equivalent under the Laue symmetry but inequivalent
     * under the crystal class) according to the nature of the
     * structure and the procedures used. Any special characteristics
     * of the reflections included in the REFLN list should be
     * described using the item _reflns.details.
     * @return IntColumn
     */
    public IntColumn getNumberGt() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_gt", IntColumn::new) :
                getBinaryColumn("number_gt"));
    }

    /**
     * The threshold, usually based on multiples of u(I), u(F^2^)
     * or u(F), that serves to identify significantly intense
     * reflections, the number of which is given by _reflns.number_gt.
     * These reflections are used in the calculation of
     * _refine.ls_R_factor_gt.
     * @return StrColumn
     */
    public StrColumn getThresholdExpression() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("threshold_expression", StrColumn::new) :
                getBinaryColumn("threshold_expression"));
    }

    /**
     * Overall redundancy for this data set (%).
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_redundancy", FloatColumn::new) :
                getBinaryColumn("pdbx_redundancy"));
    }

    /**
     * The R value for merging intensities satisfying the observed
     * criteria in this data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_obs", FloatColumn::new) :
                getBinaryColumn("pdbx_Rmerge_I_obs"));
    }

    /**
     * The R value for merging all intensities in this data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_all", FloatColumn::new) :
                getBinaryColumn("pdbx_Rmerge_I_all"));
    }

    /**
     * The R sym value as a decimal number.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRsymValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rsym_value", FloatColumn::new) :
                getBinaryColumn("pdbx_Rsym_value"));
    }

    /**
     * The ratio of the average intensity to the average uncertainty,
     * &lt;I&gt;/&lt;sigma(I)&gt;.
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverAvSigmaI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_netI_over_av_sigmaI", FloatColumn::new) :
                getBinaryColumn("pdbx_netI_over_av_sigmaI"));
    }

    /**
     * The mean of the ratio of the intensities to their
     * standard uncertainties, &lt;I/sigma(I)&gt;.
     * @return FloatColumn
     */
    public FloatColumn getPdbxNetIOverSigmaI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_netI_over_sigmaI", FloatColumn::new) :
                getBinaryColumn("pdbx_netI_over_sigmaI"));
    }

    /**
     * Resolution (angstrom) for reflections with  &lt;I&gt;/&lt;sigma(I)&gt; = 2.
     * @return FloatColumn
     */
    public FloatColumn getPdbxResNetIOverAvSigmaI2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_res_netI_over_av_sigmaI_2", FloatColumn::new) :
                getBinaryColumn("pdbx_res_netI_over_av_sigmaI_2"));
    }

    /**
     * Resolution (angstroms) for reflections with  &lt;I/sigma(I)&gt; = 2.
     * @return FloatColumn
     */
    public FloatColumn getPdbxResNetIOverSigmaI2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_res_netI_over_sigmaI_2", FloatColumn::new) :
                getBinaryColumn("pdbx_res_netI_over_sigmaI_2"));
    }

    /**
     * Overall  Chi-squared statistic.
     * @return FloatColumn
     */
    public FloatColumn getPdbxChiSquared() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_chi_squared", FloatColumn::new) :
                getBinaryColumn("pdbx_chi_squared"));
    }

    /**
     * Number of reflections rejected in scaling operations.
     * @return IntColumn
     */
    public IntColumn getPdbxScalingRejects() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_scaling_rejects", IntColumn::new) :
                getBinaryColumn("pdbx_scaling_rejects"));
    }

    /**
     * The highest optical resolution for this reflection data set
     * as determined by computational method _reflns.pdbx_d_res_opt_method.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHighOpt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_high_opt", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_high_opt"));
    }

    /**
     * The lowest optical resolution for this reflection data set
     * as determined by computational method _reflns.pdbx_d_res_opt_method.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLowOpt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_low_opt", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_low_opt"));
    }

    /**
     * The computational method used to determine the optical
     * resolution limits _reflns.pdbx_d_res_high_opt and
     * _reflns.pdbx_d_res_low_opt.
     * @return StrColumn
     */
    public StrColumn getPdbxDResOptMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_opt_method", StrColumn::new) :
                getBinaryColumn("pdbx_d_res_opt_method"));
    }

    /**
     * The value of _reflns.phase_calculation_details describes a
     * special details about calculation of phases in _refln.phase_calc.
     * @return StrColumn
     */
    public StrColumn getPhaseCalculationDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phase_calculation_details", StrColumn::new) :
                getBinaryColumn("phase_calculation_details"));
    }

    /**
     * The redundancy-independent merging R factor value Rrim,
     * also denoted Rmeas, for merging all intensities in this
     * data set.
     * 
     * sum~i~ [N~i~/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - &lt;I~i~&gt; |
     * Rrim = ----------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * &lt;I~i~&gt; = the mean of the intensities of all observations of
     * reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. &amp; Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. &amp; Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rrim_I_all", FloatColumn::new) :
                getBinaryColumn("pdbx_Rrim_I_all"));
    }

    /**
     * The precision-indicating merging R factor value Rpim,
     * for merging all intensities in this data set.
     * 
     * sum~i~ [1/(N~i~ - 1)]1/2^ sum~j~ | I~j~ - &lt;I~i~&gt; |
     * Rpim = --------------------------------------------------
     * sum~i~ ( sum~j~ I~j~ )
     * 
     * I~j~   = the intensity of the jth observation of reflection i
     * &lt;I~i~&gt; = the mean of the intensities of all observations
     * of reflection i
     * N~i~   = the redundancy (the number of times reflection i
     * has been measured).
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * 
     * Ref: Diederichs, K. &amp; Karplus, P. A. (1997). Nature Struct.
     * Biol. 4, 269-275.
     * Weiss, M. S. &amp; Hilgenfeld, R. (1997). J. Appl. Cryst.
     * 30, 203-205.
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rpim_I_all", FloatColumn::new) :
                getBinaryColumn("pdbx_Rpim_I_all"));
    }

    /**
     * The optical resolution of the data set, d(opt), is the
     * expected minimum distance between two resolved peaks in
     * an electron-density map.
     * 
     * d(opt) = {2[sigma(Patt)2^ + sigma(sph)2^]}1/2^
     * 
     * sigma(Patt) = standard deviation of the Gaussian function
     * fitted to the Patterson origin peak
     * sigma(sph)  = standard deviation of the Gaussian function
     * fitted to the origin peak of the spherical
     * interference function, representing the Fourier
     * transform of a sphere with radius 1/dmin
     * dmin        = nominal resolution (_reflns.d_resolution_high)
     * 
     * Ref: Vaguine, A. A., Richelle, J. &amp; Wodak, S. J. (1999).
     * Acta Cryst. D55, 191-205.
     * (see also http://www.ysbl.york.ac.uk/~alexei/sfcheck.html)
     * Weiss, M. S. (2001). J. Appl. Cryst. 34, 130-135.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDOpt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_opt", FloatColumn::new) :
                getBinaryColumn("pdbx_d_opt"));
    }

    /**
     * Total number of measured reflections.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberMeasuredAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_measured_all", IntColumn::new) :
                getBinaryColumn("pdbx_number_measured_all"));
    }

    /**
     * An identifier for the diffraction data set for this set of summary statistics.
     * 
     * Multiple diffraction data sets entered as a comma separated list.
     * @return StrColumn
     */
    public StrColumn getPdbxDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_diffrn_id", StrColumn::new) :
                getBinaryColumn("pdbx_diffrn_id"));
    }

    /**
     * An ordinal identifier for this set of reflection statistics.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The Pearson's correlation coefficient expressed as a decimal value
     * between the average intensities from randomly selected
     * half-datasets.
     * 
     * Ref: Karplus &amp; Diederichs (2012), Science 336, 1030-33
     * @return FloatColumn
     */
    public FloatColumn getPdbxCCHalf() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_CC_half", FloatColumn::new) :
                getBinaryColumn("pdbx_CC_half"));
    }

    /**
     * R split measures the agreement between the sets of intensities created by merging
     * odd- and even-numbered images  from the overall data.
     * 
     * Ref: T. A. White, R. A. Kirian, A. V. Martin, A. Aquila, K. Nass, A. Barty
     * and H. N. Chapman (2012), J. Appl. Cryst. 45, 335-341
     * @return FloatColumn
     */
    public FloatColumn getPdbxRSplit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_split", FloatColumn::new) :
                getBinaryColumn("pdbx_R_split"));
    }

    /**
     * The redundancy in set of observed reflections.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRedundancyReflnsObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_redundancy_reflns_obs", FloatColumn::new) :
                getBinaryColumn("pdbx_redundancy_reflns_obs"));
    }

    /**
     * This item is the same as _reflns.number_obs, but applies to
     * observed Friedel pairs only.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAnomalous() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_anomalous", IntColumn::new) :
                getBinaryColumn("pdbx_number_anomalous"));
    }

    /**
     * This item is the same as _reflns.pdbx_Rrim_I_all,
     * but applies to the observed Friedel pairs only.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRrimIAllAnomalous() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rrim_I_all_anomalous", FloatColumn::new) :
                getBinaryColumn("pdbx_Rrim_I_all_anomalous"));
    }

    /**
     * This item is the same as _reflns.pdbx_Rpim_I_all, but applies only
     * to observed Friedel pairs.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRpimIAllAnomalous() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rpim_I_all_anomalous", FloatColumn::new) :
                getBinaryColumn("pdbx_Rpim_I_all_anomalous"));
    }

    /**
     * This item is the same as _reflns.pdbx_Rmerge_I, but applies only
     * to observed Friedel pairs.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRmergeIAnomalous() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_Rmerge_I_anomalous", FloatColumn::new) :
                getBinaryColumn("pdbx_Rmerge_I_anomalous"));
    }
}
