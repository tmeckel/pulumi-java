// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaxonomyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaxonomyArgs Empty = new TaxonomyArgs();

    /**
     * A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    @Import(name="activatedPolicyTypes")
    private @Nullable Output<List<String>> activatedPolicyTypes;

    /**
     * @return A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    public Optional<Output<List<String>>> activatedPolicyTypes() {
        return Optional.ofNullable(this.activatedPolicyTypes);
    }

    /**
     * Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User defined name of this taxonomy.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return User defined name of this taxonomy.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Taxonomy location region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Taxonomy location region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private TaxonomyArgs() {}

    private TaxonomyArgs(TaxonomyArgs $) {
        this.activatedPolicyTypes = $.activatedPolicyTypes;
        this.description = $.description;
        this.displayName = $.displayName;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaxonomyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaxonomyArgs $;

        public Builder() {
            $ = new TaxonomyArgs();
        }

        public Builder(TaxonomyArgs defaults) {
            $ = new TaxonomyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activatedPolicyTypes A list of policy types that are activated for this taxonomy. If not set,
         * defaults to an empty list.
         * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
         * 
         * @return builder
         * 
         */
        public Builder activatedPolicyTypes(@Nullable Output<List<String>> activatedPolicyTypes) {
            $.activatedPolicyTypes = activatedPolicyTypes;
            return this;
        }

        /**
         * @param activatedPolicyTypes A list of policy types that are activated for this taxonomy. If not set,
         * defaults to an empty list.
         * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
         * 
         * @return builder
         * 
         */
        public Builder activatedPolicyTypes(List<String> activatedPolicyTypes) {
            return activatedPolicyTypes(Output.of(activatedPolicyTypes));
        }

        /**
         * @param activatedPolicyTypes A list of policy types that are activated for this taxonomy. If not set,
         * defaults to an empty list.
         * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
         * 
         * @return builder
         * 
         */
        public Builder activatedPolicyTypes(String... activatedPolicyTypes) {
            return activatedPolicyTypes(List.of(activatedPolicyTypes));
        }

        /**
         * @param description Description of this taxonomy. It must: contain only unicode characters,
         * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
         * long when encoded in UTF-8. If not set, defaults to an empty description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this taxonomy. It must: contain only unicode characters,
         * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
         * long when encoded in UTF-8. If not set, defaults to an empty description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User defined name of this taxonomy.
         * It must: contain only unicode letters, numbers, underscores, dashes
         * and spaces; not start or end with spaces; and be at most 200 bytes
         * long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User defined name of this taxonomy.
         * It must: contain only unicode letters, numbers, underscores, dashes
         * and spaces; not start or end with spaces; and be at most 200 bytes
         * long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region Taxonomy location region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Taxonomy location region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public TaxonomyArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
