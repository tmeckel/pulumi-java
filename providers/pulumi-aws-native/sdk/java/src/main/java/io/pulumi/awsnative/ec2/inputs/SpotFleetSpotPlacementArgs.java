// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetSpotPlacementTenancy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetSpotPlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetSpotPlacementArgs Empty = new SpotFleetSpotPlacementArgs();

    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    @Import(name="groupName")
      private final @Nullable Output<String> groupName;

    public Output<String> getGroupName() {
        return this.groupName == null ? Codegen.empty() : this.groupName;
    }

    @Import(name="tenancy")
      private final @Nullable Output<SpotFleetSpotPlacementTenancy> tenancy;

    public Output<SpotFleetSpotPlacementTenancy> getTenancy() {
        return this.tenancy == null ? Codegen.empty() : this.tenancy;
    }

    public SpotFleetSpotPlacementArgs(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> groupName,
        @Nullable Output<SpotFleetSpotPlacementTenancy> tenancy) {
        this.availabilityZone = availabilityZone;
        this.groupName = groupName;
        this.tenancy = tenancy;
    }

    private SpotFleetSpotPlacementArgs() {
        this.availabilityZone = Codegen.empty();
        this.groupName = Codegen.empty();
        this.tenancy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetSpotPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> groupName;
        private @Nullable Output<SpotFleetSpotPlacementTenancy> tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetSpotPlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.groupName = defaults.groupName;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder groupName(@Nullable Output<String> groupName) {
            this.groupName = groupName;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = Codegen.ofNullable(groupName);
            return this;
        }
        public Builder tenancy(@Nullable Output<SpotFleetSpotPlacementTenancy> tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public Builder tenancy(@Nullable SpotFleetSpotPlacementTenancy tenancy) {
            this.tenancy = Codegen.ofNullable(tenancy);
            return this;
        }        public SpotFleetSpotPlacementArgs build() {
            return new SpotFleetSpotPlacementArgs(availabilityZone, groupName, tenancy);
        }
    }
}
