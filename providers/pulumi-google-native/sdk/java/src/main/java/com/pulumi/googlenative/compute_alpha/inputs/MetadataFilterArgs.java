// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.MetadataFilterFilterMatchCriteria;
import com.pulumi.googlenative.compute_alpha.inputs.MetadataFilterLabelMatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Opaque filter criteria used by load balancers to restrict routing configuration to a limited set of load balancing proxies. Proxies and sidecars involved in load balancing would typically present metadata to the load balancers that need to match criteria specified here. If a match takes place, the relevant configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. An example for using metadataFilters would be: if load balancing involves Envoys, they receive routing configuration when values in metadataFilters match values supplied in of their XDS requests to loadbalancers.
 * 
 */
public final class MetadataFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetadataFilterArgs Empty = new MetadataFilterArgs();

    /**
     * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
     * 
     */
    @Import(name="filterLabels")
    private @Nullable Output<List<MetadataFilterLabelMatchArgs>> filterLabels;

    /**
     * @return The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
     * 
     */
    public Optional<Output<List<MetadataFilterLabelMatchArgs>>> filterLabels() {
        return Optional.ofNullable(this.filterLabels);
    }

    /**
     * Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
     * 
     */
    @Import(name="filterMatchCriteria")
    private @Nullable Output<MetadataFilterFilterMatchCriteria> filterMatchCriteria;

    /**
     * @return Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
     * 
     */
    public Optional<Output<MetadataFilterFilterMatchCriteria>> filterMatchCriteria() {
        return Optional.ofNullable(this.filterMatchCriteria);
    }

    private MetadataFilterArgs() {}

    private MetadataFilterArgs(MetadataFilterArgs $) {
        this.filterLabels = $.filterLabels;
        this.filterMatchCriteria = $.filterMatchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataFilterArgs $;

        public Builder() {
            $ = new MetadataFilterArgs();
        }

        public Builder(MetadataFilterArgs defaults) {
            $ = new MetadataFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterLabels The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
         * 
         * @return builder
         * 
         */
        public Builder filterLabels(@Nullable Output<List<MetadataFilterLabelMatchArgs>> filterLabels) {
            $.filterLabels = filterLabels;
            return this;
        }

        /**
         * @param filterLabels The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
         * 
         * @return builder
         * 
         */
        public Builder filterLabels(List<MetadataFilterLabelMatchArgs> filterLabels) {
            return filterLabels(Output.of(filterLabels));
        }

        /**
         * @param filterLabels The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
         * 
         * @return builder
         * 
         */
        public Builder filterLabels(MetadataFilterLabelMatchArgs... filterLabels) {
            return filterLabels(List.of(filterLabels));
        }

        /**
         * @param filterMatchCriteria Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder filterMatchCriteria(@Nullable Output<MetadataFilterFilterMatchCriteria> filterMatchCriteria) {
            $.filterMatchCriteria = filterMatchCriteria;
            return this;
        }

        /**
         * @param filterMatchCriteria Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder filterMatchCriteria(MetadataFilterFilterMatchCriteria filterMatchCriteria) {
            return filterMatchCriteria(Output.of(filterMatchCriteria));
        }

        public MetadataFilterArgs build() {
            return $;
        }
    }

}
