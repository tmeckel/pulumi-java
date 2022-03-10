// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.AssignedUserResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PersonalComputeInstanceSettingsResponse {
    /**
     * A user explicitly assigned to a personal compute instance.
     * 
     */
    private final @Nullable AssignedUserResponse assignedUser;

    @OutputCustomType.Constructor
    private PersonalComputeInstanceSettingsResponse(@OutputCustomType.Parameter("assignedUser") @Nullable AssignedUserResponse assignedUser) {
        this.assignedUser = assignedUser;
    }

    /**
     * A user explicitly assigned to a personal compute instance.
     * 
    */
    public Optional<AssignedUserResponse> getAssignedUser() {
        return Optional.ofNullable(this.assignedUser);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersonalComputeInstanceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AssignedUserResponse assignedUser;

        public Builder() {
    	      // Empty
        }

        public Builder(PersonalComputeInstanceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedUser = defaults.assignedUser;
        }

        public Builder assignedUser(@Nullable AssignedUserResponse assignedUser) {
            this.assignedUser = assignedUser;
            return this;
        }
        public PersonalComputeInstanceSettingsResponse build() {
            return new PersonalComputeInstanceSettingsResponse(assignedUser);
        }
    }
}
