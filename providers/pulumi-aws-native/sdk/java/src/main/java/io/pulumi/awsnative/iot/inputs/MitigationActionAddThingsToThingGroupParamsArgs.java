// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters to define a mitigation action that moves devices associated with a certificate to one or more specified thing groups, typically for quarantine.
 * 
 */
public final class MitigationActionAddThingsToThingGroupParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionAddThingsToThingGroupParamsArgs Empty = new MitigationActionAddThingsToThingGroupParamsArgs();

    /**
     * Specifies if this mitigation action can move the things that triggered the mitigation action out of one or more dynamic thing groups.
     * 
     */
    @Import(name="overrideDynamicGroups")
      private final @Nullable Output<Boolean> overrideDynamicGroups;

    public Output<Boolean> getOverrideDynamicGroups() {
        return this.overrideDynamicGroups == null ? Codegen.empty() : this.overrideDynamicGroups;
    }

    /**
     * The list of groups to which you want to add the things that triggered the mitigation action.
     * 
     */
    @Import(name="thingGroupNames", required=true)
      private final Output<List<String>> thingGroupNames;

    public Output<List<String>> getThingGroupNames() {
        return this.thingGroupNames;
    }

    public MitigationActionAddThingsToThingGroupParamsArgs(
        @Nullable Output<Boolean> overrideDynamicGroups,
        Output<List<String>> thingGroupNames) {
        this.overrideDynamicGroups = overrideDynamicGroups;
        this.thingGroupNames = Objects.requireNonNull(thingGroupNames, "expected parameter 'thingGroupNames' to be non-null");
    }

    private MitigationActionAddThingsToThingGroupParamsArgs() {
        this.overrideDynamicGroups = Codegen.empty();
        this.thingGroupNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionAddThingsToThingGroupParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> overrideDynamicGroups;
        private Output<List<String>> thingGroupNames;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionAddThingsToThingGroupParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overrideDynamicGroups = defaults.overrideDynamicGroups;
    	      this.thingGroupNames = defaults.thingGroupNames;
        }

        public Builder overrideDynamicGroups(@Nullable Output<Boolean> overrideDynamicGroups) {
            this.overrideDynamicGroups = overrideDynamicGroups;
            return this;
        }
        public Builder overrideDynamicGroups(@Nullable Boolean overrideDynamicGroups) {
            this.overrideDynamicGroups = Codegen.ofNullable(overrideDynamicGroups);
            return this;
        }
        public Builder thingGroupNames(Output<List<String>> thingGroupNames) {
            this.thingGroupNames = Objects.requireNonNull(thingGroupNames);
            return this;
        }
        public Builder thingGroupNames(List<String> thingGroupNames) {
            this.thingGroupNames = Output.of(Objects.requireNonNull(thingGroupNames));
            return this;
        }
        public Builder thingGroupNames(String... thingGroupNames) {
            return thingGroupNames(List.of(thingGroupNames));
        }        public MitigationActionAddThingsToThingGroupParamsArgs build() {
            return new MitigationActionAddThingsToThingGroupParamsArgs(overrideDynamicGroups, thingGroupNames);
        }
    }
}
