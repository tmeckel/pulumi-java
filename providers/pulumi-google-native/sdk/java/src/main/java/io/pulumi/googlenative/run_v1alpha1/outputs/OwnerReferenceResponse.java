// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OwnerReferenceResponse {
    /**
     * API version of the referent.
     * 
     */
    private final String apiVersion;
    /**
     * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
     * 
     */
    private final Boolean blockOwnerDeletion;
    /**
     * If true, this reference points to the managing controller. +optional
     * 
     */
    private final Boolean controller;
    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final String kind;
    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    private final String name;
    /**
     * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    private final String uid;

    @OutputCustomType.Constructor({"apiVersion","blockOwnerDeletion","controller","kind","name","uid"})
    private OwnerReferenceResponse(
        String apiVersion,
        Boolean blockOwnerDeletion,
        Boolean controller,
        String kind,
        String name,
        String uid) {
        this.apiVersion = Objects.requireNonNull(apiVersion);
        this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion);
        this.controller = Objects.requireNonNull(controller);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.uid = Objects.requireNonNull(uid);
    }

    /**
     * API version of the referent.
     * 
     */
    public String getApiVersion() {
        return this.apiVersion;
    }
    /**
     * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
     * 
     */
    public Boolean getBlockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }
    /**
     * If true, this reference points to the managing controller. +optional
     * 
     */
    public Boolean getController() {
        return this.controller;
    }
    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    public String getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnerReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private Boolean blockOwnerDeletion;
        private Boolean controller;
        private String kind;
        private String name;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(OwnerReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.blockOwnerDeletion = defaults.blockOwnerDeletion;
    	      this.controller = defaults.controller;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        public Builder setApiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }

        public Builder setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
            this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion);
            return this;
        }

        public Builder setController(Boolean controller) {
            this.controller = Objects.requireNonNull(controller);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public OwnerReferenceResponse build() {
            return new OwnerReferenceResponse(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
        }
    }
}
