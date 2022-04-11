// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 * 
 */
public final class OwnerReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OwnerReferenceArgs Empty = new OwnerReferenceArgs();

    /**
     * API version of the referent.
     * 
     */
    @Import(name="apiVersion", required=true)
      private final Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion;
    }

    /**
     * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    @Import(name="blockOwnerDeletion")
      private final @Nullable Output<Boolean> blockOwnerDeletion;

    public Output<Boolean> getBlockOwnerDeletion() {
        return this.blockOwnerDeletion == null ? Codegen.empty() : this.blockOwnerDeletion;
    }

    /**
     * If true, this reference points to the managing controller.
     * 
     */
    @Import(name="controller")
      private final @Nullable Output<Boolean> controller;

    public Output<Boolean> getController() {
        return this.controller == null ? Codegen.empty() : this.controller;
    }

    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid", required=true)
      private final Output<String> uid;

    public Output<String> getUid() {
        return this.uid;
    }

    public OwnerReferenceArgs(
        Output<String> apiVersion,
        @Nullable Output<Boolean> blockOwnerDeletion,
        @Nullable Output<Boolean> controller,
        Output<String> kind,
        Output<String> name,
        Output<String> uid) {
        this.apiVersion = Objects.requireNonNull(apiVersion, "expected parameter 'apiVersion' to be non-null");
        this.blockOwnerDeletion = blockOwnerDeletion;
        this.controller = controller;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private OwnerReferenceArgs() {
        this.apiVersion = Codegen.empty();
        this.blockOwnerDeletion = Codegen.empty();
        this.controller = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.uid = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnerReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiVersion;
        private @Nullable Output<Boolean> blockOwnerDeletion;
        private @Nullable Output<Boolean> controller;
        private Output<String> kind;
        private Output<String> name;
        private Output<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(OwnerReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.blockOwnerDeletion = defaults.blockOwnerDeletion;
    	      this.controller = defaults.controller;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        public Builder apiVersion(Output<String> apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Output.of(Objects.requireNonNull(apiVersion));
            return this;
        }
        public Builder blockOwnerDeletion(@Nullable Output<Boolean> blockOwnerDeletion) {
            this.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }
        public Builder blockOwnerDeletion(@Nullable Boolean blockOwnerDeletion) {
            this.blockOwnerDeletion = Codegen.ofNullable(blockOwnerDeletion);
            return this;
        }
        public Builder controller(@Nullable Output<Boolean> controller) {
            this.controller = controller;
            return this;
        }
        public Builder controller(@Nullable Boolean controller) {
            this.controller = Codegen.ofNullable(controller);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder uid(Output<String> uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Output.of(Objects.requireNonNull(uid));
            return this;
        }        public OwnerReferenceArgs build() {
            return new OwnerReferenceArgs(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
        }
    }
}
