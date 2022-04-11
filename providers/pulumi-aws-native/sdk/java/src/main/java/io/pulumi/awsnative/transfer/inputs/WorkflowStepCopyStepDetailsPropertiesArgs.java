// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.inputs;

import io.pulumi.awsnative.transfer.enums.WorkflowStepCopyStepDetailsPropertiesOverwriteExisting;
import io.pulumi.awsnative.transfer.inputs.WorkflowInputFileLocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for a step that performs a file copy.
 * 
 */
public final class WorkflowStepCopyStepDetailsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowStepCopyStepDetailsPropertiesArgs Empty = new WorkflowStepCopyStepDetailsPropertiesArgs();

    @Import(name="destinationFileLocation")
      private final @Nullable Output<WorkflowInputFileLocationArgs> destinationFileLocation;

    public Output<WorkflowInputFileLocationArgs> getDestinationFileLocation() {
        return this.destinationFileLocation == null ? Codegen.empty() : this.destinationFileLocation;
    }

    /**
     * The name of the step, used as an identifier.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
     * 
     */
    @Import(name="overwriteExisting")
      private final @Nullable Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> overwriteExisting;

    public Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> getOverwriteExisting() {
        return this.overwriteExisting == null ? Codegen.empty() : this.overwriteExisting;
    }

    public WorkflowStepCopyStepDetailsPropertiesArgs(
        @Nullable Output<WorkflowInputFileLocationArgs> destinationFileLocation,
        @Nullable Output<String> name,
        @Nullable Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> overwriteExisting) {
        this.destinationFileLocation = destinationFileLocation;
        this.name = name;
        this.overwriteExisting = overwriteExisting;
    }

    private WorkflowStepCopyStepDetailsPropertiesArgs() {
        this.destinationFileLocation = Codegen.empty();
        this.name = Codegen.empty();
        this.overwriteExisting = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepCopyStepDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkflowInputFileLocationArgs> destinationFileLocation;
        private @Nullable Output<String> name;
        private @Nullable Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> overwriteExisting;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepCopyStepDetailsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationFileLocation = defaults.destinationFileLocation;
    	      this.name = defaults.name;
    	      this.overwriteExisting = defaults.overwriteExisting;
        }

        public Builder destinationFileLocation(@Nullable Output<WorkflowInputFileLocationArgs> destinationFileLocation) {
            this.destinationFileLocation = destinationFileLocation;
            return this;
        }
        public Builder destinationFileLocation(@Nullable WorkflowInputFileLocationArgs destinationFileLocation) {
            this.destinationFileLocation = Codegen.ofNullable(destinationFileLocation);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder overwriteExisting(@Nullable Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> overwriteExisting) {
            this.overwriteExisting = overwriteExisting;
            return this;
        }
        public Builder overwriteExisting(@Nullable WorkflowStepCopyStepDetailsPropertiesOverwriteExisting overwriteExisting) {
            this.overwriteExisting = Codegen.ofNullable(overwriteExisting);
            return this;
        }        public WorkflowStepCopyStepDetailsPropertiesArgs build() {
            return new WorkflowStepCopyStepDetailsPropertiesArgs(destinationFileLocation, name, overwriteExisting);
        }
    }
}
