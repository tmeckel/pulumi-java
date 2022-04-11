// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssociationArgs Empty = new AssociationArgs();

    /**
     * The name of the association.
     * 
     */
    @Import(name="associationName")
      private final @Nullable Output<String> associationName;

    public Output<String> getAssociationName() {
        return this.associationName == null ? Codegen.empty() : this.associationName;
    }

    /**
     * The scope of the association. The scope can be any valid REST resource instance. For example, use '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/Microsoft.Compute/virtualMachines/{vm-name}' for a virtual machine resource.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    /**
     * The REST resource instance of the target resource for this association.
     * 
     */
    @Import(name="targetResourceId")
      private final @Nullable Output<String> targetResourceId;

    public Output<String> getTargetResourceId() {
        return this.targetResourceId == null ? Codegen.empty() : this.targetResourceId;
    }

    public AssociationArgs(
        @Nullable Output<String> associationName,
        Output<String> scope,
        @Nullable Output<String> targetResourceId) {
        this.associationName = associationName;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.targetResourceId = targetResourceId;
    }

    private AssociationArgs() {
        this.associationName = Codegen.empty();
        this.scope = Codegen.empty();
        this.targetResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> associationName;
        private Output<String> scope;
        private @Nullable Output<String> targetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationName = defaults.associationName;
    	      this.scope = defaults.scope;
    	      this.targetResourceId = defaults.targetResourceId;
        }

        public Builder associationName(@Nullable Output<String> associationName) {
            this.associationName = associationName;
            return this;
        }
        public Builder associationName(@Nullable String associationName) {
            this.associationName = Codegen.ofNullable(associationName);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = Codegen.ofNullable(targetResourceId);
            return this;
        }        public AssociationArgs build() {
            return new AssociationArgs(associationName, scope, targetResourceId);
        }
    }
}
