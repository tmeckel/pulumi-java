// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageIamPolicyArgs Empty = new MachineImageIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="machineImage", required=true)
      private final Input<String> machineImage;

    public Input<String> getMachineImage() {
        return this.machineImage;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
      private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public MachineImageIamPolicyArgs(
        Input<String> machineImage,
        Input<String> policyData,
        @Nullable Input<String> project) {
        this.machineImage = Objects.requireNonNull(machineImage, "expected parameter 'machineImage' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private MachineImageIamPolicyArgs() {
        this.machineImage = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> machineImage;
        private Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineImage = defaults.machineImage;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder machineImage(Input<String> machineImage) {
            this.machineImage = Objects.requireNonNull(machineImage);
            return this;
        }

        public Builder machineImage(String machineImage) {
            this.machineImage = Input.of(Objects.requireNonNull(machineImage));
            return this;
        }

        public Builder policyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder policyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public MachineImageIamPolicyArgs build() {
            return new MachineImageIamPolicyArgs(machineImage, policyData, project);
        }
    }
}
