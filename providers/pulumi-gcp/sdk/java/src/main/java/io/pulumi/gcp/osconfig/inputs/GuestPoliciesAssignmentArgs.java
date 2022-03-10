// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentGroupLabelArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentOsTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentArgs Empty = new GuestPoliciesAssignmentArgs();

    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
     * for example "env=prod or env=staging".
     * Structure is documented below.
     * 
     */
    @InputImport(name="groupLabels")
      private final @Nullable Input<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels;

    public Input<List<GuestPoliciesAssignmentGroupLabelArgs>> getGroupLabels() {
        return this.groupLabels == null ? Input.empty() : this.groupLabels;
    }

    /**
     * Targets VM instances whose name starts with one of these prefixes.
     * Like labels, this is another way to group VM instances when targeting configs,
     * for example prefix="prod-".
     * Only supported for project-level policies.
     * 
     */
    @InputImport(name="instanceNamePrefixes")
      private final @Nullable Input<List<String>> instanceNamePrefixes;

    public Input<List<String>> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? Input.empty() : this.instanceNamePrefixes;
    }

    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form
     * zones/[ZONE]/instances/[INSTANCE_NAME].
     * Instance targeting is uncommon and is supported to facilitate the management of changes
     * by the instance or to target specific VM instances for development and testing.
     * Only supported for project-level policies and must reference instances within this project.
     * 
     */
    @InputImport(name="instances")
      private final @Nullable Input<List<String>> instances;

    public Input<List<String>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * Targets VM instances matching at least one of the following OS types.
     * VM instances must match all supplied criteria for a given OsType to be included.
     * Structure is documented below.
     * 
     */
    @InputImport(name="osTypes")
      private final @Nullable Input<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes;

    public Input<List<GuestPoliciesAssignmentOsTypeArgs>> getOsTypes() {
        return this.osTypes == null ? Input.empty() : this.osTypes;
    }

    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone.
     * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public GuestPoliciesAssignmentArgs(
        @Nullable Input<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels,
        @Nullable Input<List<String>> instanceNamePrefixes,
        @Nullable Input<List<String>> instances,
        @Nullable Input<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes,
        @Nullable Input<List<String>> zones) {
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.osTypes = osTypes;
        this.zones = zones;
    }

    private GuestPoliciesAssignmentArgs() {
        this.groupLabels = Input.empty();
        this.instanceNamePrefixes = Input.empty();
        this.instances = Input.empty();
        this.osTypes = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels;
        private @Nullable Input<List<String>> instanceNamePrefixes;
        private @Nullable Input<List<String>> instances;
        private @Nullable Input<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.osTypes = defaults.osTypes;
    	      this.zones = defaults.zones;
        }

        public Builder groupLabels(@Nullable Input<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }

        public Builder groupLabels(@Nullable List<GuestPoliciesAssignmentGroupLabelArgs> groupLabels) {
            this.groupLabels = Input.ofNullable(groupLabels);
            return this;
        }

        public Builder instanceNamePrefixes(@Nullable Input<List<String>> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }

        public Builder instanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = Input.ofNullable(instanceNamePrefixes);
            return this;
        }

        public Builder instances(@Nullable Input<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder instances(@Nullable List<String> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder osTypes(@Nullable Input<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes) {
            this.osTypes = osTypes;
            return this;
        }

        public Builder osTypes(@Nullable List<GuestPoliciesAssignmentOsTypeArgs> osTypes) {
            this.osTypes = Input.ofNullable(osTypes);
            return this;
        }

        public Builder zones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public GuestPoliciesAssignmentArgs build() {
            return new GuestPoliciesAssignmentArgs(groupLabels, instanceNamePrefixes, instances, osTypes, zones);
        }
    }
}
