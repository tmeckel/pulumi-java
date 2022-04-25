// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentGroupLabelArgs;
import com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentOsTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPoliciesAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentArgs Empty = new GuestPoliciesAssignmentArgs();

    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
     * for example &#34;env=prod or env=staging&#34;.
     * Structure is documented below.
     * 
     */
    @Import(name="groupLabels")
    private @Nullable Output<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels;

    /**
     * @return Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
     * for example &#34;env=prod or env=staging&#34;.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<GuestPoliciesAssignmentGroupLabelArgs>>> groupLabels() {
        return Optional.ofNullable(this.groupLabels);
    }

    /**
     * Targets VM instances whose name starts with one of these prefixes.
     * Like labels, this is another way to group VM instances when targeting configs,
     * for example prefix=&#34;prod-&#34;.
     * Only supported for project-level policies.
     * 
     */
    @Import(name="instanceNamePrefixes")
    private @Nullable Output<List<String>> instanceNamePrefixes;

    /**
     * @return Targets VM instances whose name starts with one of these prefixes.
     * Like labels, this is another way to group VM instances when targeting configs,
     * for example prefix=&#34;prod-&#34;.
     * Only supported for project-level policies.
     * 
     */
    public Optional<Output<List<String>>> instanceNamePrefixes() {
        return Optional.ofNullable(this.instanceNamePrefixes);
    }

    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form
     * zones/[ZONE]/instances/[INSTANCE_NAME].
     * Instance targeting is uncommon and is supported to facilitate the management of changes
     * by the instance or to target specific VM instances for development and testing.
     * Only supported for project-level policies and must reference instances within this project.
     * 
     */
    @Import(name="instances")
    private @Nullable Output<List<String>> instances;

    /**
     * @return Targets any of the instances specified. Instances are specified by their URI in the form
     * zones/[ZONE]/instances/[INSTANCE_NAME].
     * Instance targeting is uncommon and is supported to facilitate the management of changes
     * by the instance or to target specific VM instances for development and testing.
     * Only supported for project-level policies and must reference instances within this project.
     * 
     */
    public Optional<Output<List<String>>> instances() {
        return Optional.ofNullable(this.instances);
    }

    /**
     * Targets VM instances matching at least one of the following OS types.
     * VM instances must match all supplied criteria for a given OsType to be included.
     * Structure is documented below.
     * 
     */
    @Import(name="osTypes")
    private @Nullable Output<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes;

    /**
     * @return Targets VM instances matching at least one of the following OS types.
     * VM instances must match all supplied criteria for a given OsType to be included.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<GuestPoliciesAssignmentOsTypeArgs>>> osTypes() {
        return Optional.ofNullable(this.osTypes);
    }

    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone.
     * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Targets instances in any of these zones. Leave empty to target instances in any zone.
     * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private GuestPoliciesAssignmentArgs() {}

    private GuestPoliciesAssignmentArgs(GuestPoliciesAssignmentArgs $) {
        this.groupLabels = $.groupLabels;
        this.instanceNamePrefixes = $.instanceNamePrefixes;
        this.instances = $.instances;
        this.osTypes = $.osTypes;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesAssignmentArgs $;

        public Builder() {
            $ = new GuestPoliciesAssignmentArgs();
        }

        public Builder(GuestPoliciesAssignmentArgs defaults) {
            $ = new GuestPoliciesAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupLabels Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
         * for example &#34;env=prod or env=staging&#34;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder groupLabels(@Nullable Output<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels) {
            $.groupLabels = groupLabels;
            return this;
        }

        /**
         * @param groupLabels Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
         * for example &#34;env=prod or env=staging&#34;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder groupLabels(List<GuestPoliciesAssignmentGroupLabelArgs> groupLabels) {
            return groupLabels(Output.of(groupLabels));
        }

        /**
         * @param groupLabels Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
         * for example &#34;env=prod or env=staging&#34;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder groupLabels(GuestPoliciesAssignmentGroupLabelArgs... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }

        /**
         * @param instanceNamePrefixes Targets VM instances whose name starts with one of these prefixes.
         * Like labels, this is another way to group VM instances when targeting configs,
         * for example prefix=&#34;prod-&#34;.
         * Only supported for project-level policies.
         * 
         * @return builder
         * 
         */
        public Builder instanceNamePrefixes(@Nullable Output<List<String>> instanceNamePrefixes) {
            $.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }

        /**
         * @param instanceNamePrefixes Targets VM instances whose name starts with one of these prefixes.
         * Like labels, this is another way to group VM instances when targeting configs,
         * for example prefix=&#34;prod-&#34;.
         * Only supported for project-level policies.
         * 
         * @return builder
         * 
         */
        public Builder instanceNamePrefixes(List<String> instanceNamePrefixes) {
            return instanceNamePrefixes(Output.of(instanceNamePrefixes));
        }

        /**
         * @param instanceNamePrefixes Targets VM instances whose name starts with one of these prefixes.
         * Like labels, this is another way to group VM instances when targeting configs,
         * for example prefix=&#34;prod-&#34;.
         * Only supported for project-level policies.
         * 
         * @return builder
         * 
         */
        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }

        /**
         * @param instances Targets any of the instances specified. Instances are specified by their URI in the form
         * zones/[ZONE]/instances/[INSTANCE_NAME].
         * Instance targeting is uncommon and is supported to facilitate the management of changes
         * by the instance or to target specific VM instances for development and testing.
         * Only supported for project-level policies and must reference instances within this project.
         * 
         * @return builder
         * 
         */
        public Builder instances(@Nullable Output<List<String>> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances Targets any of the instances specified. Instances are specified by their URI in the form
         * zones/[ZONE]/instances/[INSTANCE_NAME].
         * Instance targeting is uncommon and is supported to facilitate the management of changes
         * by the instance or to target specific VM instances for development and testing.
         * Only supported for project-level policies and must reference instances within this project.
         * 
         * @return builder
         * 
         */
        public Builder instances(List<String> instances) {
            return instances(Output.of(instances));
        }

        /**
         * @param instances Targets any of the instances specified. Instances are specified by their URI in the form
         * zones/[ZONE]/instances/[INSTANCE_NAME].
         * Instance targeting is uncommon and is supported to facilitate the management of changes
         * by the instance or to target specific VM instances for development and testing.
         * Only supported for project-level policies and must reference instances within this project.
         * 
         * @return builder
         * 
         */
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }

        /**
         * @param osTypes Targets VM instances matching at least one of the following OS types.
         * VM instances must match all supplied criteria for a given OsType to be included.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder osTypes(@Nullable Output<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes) {
            $.osTypes = osTypes;
            return this;
        }

        /**
         * @param osTypes Targets VM instances matching at least one of the following OS types.
         * VM instances must match all supplied criteria for a given OsType to be included.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder osTypes(List<GuestPoliciesAssignmentOsTypeArgs> osTypes) {
            return osTypes(Output.of(osTypes));
        }

        /**
         * @param osTypes Targets VM instances matching at least one of the following OS types.
         * VM instances must match all supplied criteria for a given OsType to be included.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder osTypes(GuestPoliciesAssignmentOsTypeArgs... osTypes) {
            return osTypes(List.of(osTypes));
        }

        /**
         * @param zones Targets instances in any of these zones. Leave empty to target instances in any zone.
         * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Targets instances in any of these zones. Leave empty to target instances in any zone.
         * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Targets instances in any of these zones. Leave empty to target instances in any zone.
         * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public GuestPoliciesAssignmentArgs build() {
            return $;
        }
    }

}
