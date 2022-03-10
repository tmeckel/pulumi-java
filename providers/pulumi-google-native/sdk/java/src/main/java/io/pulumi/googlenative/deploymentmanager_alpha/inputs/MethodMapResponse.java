// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Deployment Manager will call these methods during the events of creation/deletion/update/get/setIamPolicy
 * 
 */
public final class MethodMapResponse extends io.pulumi.resources.InvokeArgs {

    public static final MethodMapResponse Empty = new MethodMapResponse();

    /**
     * The action identifier for the create method to be used for this collection
     * 
     */
    @InputImport(name="create", required=true)
      private final String create;

    public String getCreate() {
        return this.create;
    }

    /**
     * The action identifier for the delete method to be used for this collection
     * 
     */
    @InputImport(name="delete", required=true)
      private final String delete;

    public String getDelete() {
        return this.delete;
    }

    /**
     * The action identifier for the get method to be used for this collection
     * 
     */
    @InputImport(name="get", required=true)
      private final String get;

    public String getGet() {
        return this.get;
    }

    /**
     * The action identifier for the setIamPolicy method to be used for this collection
     * 
     */
    @InputImport(name="setIamPolicy", required=true)
      private final String setIamPolicy;

    public String getSetIamPolicy() {
        return this.setIamPolicy;
    }

    /**
     * The action identifier for the update method to be used for this collection
     * 
     */
    @InputImport(name="update", required=true)
      private final String update;

    public String getUpdate() {
        return this.update;
    }

    public MethodMapResponse(
        String create,
        String delete,
        String get,
        String setIamPolicy,
        String update) {
        this.create = Objects.requireNonNull(create, "expected parameter 'create' to be non-null");
        this.delete = Objects.requireNonNull(delete, "expected parameter 'delete' to be non-null");
        this.get = Objects.requireNonNull(get, "expected parameter 'get' to be non-null");
        this.setIamPolicy = Objects.requireNonNull(setIamPolicy, "expected parameter 'setIamPolicy' to be non-null");
        this.update = Objects.requireNonNull(update, "expected parameter 'update' to be non-null");
    }

    private MethodMapResponse() {
        this.create = null;
        this.delete = null;
        this.get = null;
        this.setIamPolicy = null;
        this.update = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String create;
        private String delete;
        private String get;
        private String setIamPolicy;
        private String update;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.create = defaults.create;
    	      this.delete = defaults.delete;
    	      this.get = defaults.get;
    	      this.setIamPolicy = defaults.setIamPolicy;
    	      this.update = defaults.update;
        }

        public Builder create(String create) {
            this.create = Objects.requireNonNull(create);
            return this;
        }

        public Builder delete(String delete) {
            this.delete = Objects.requireNonNull(delete);
            return this;
        }

        public Builder get(String get) {
            this.get = Objects.requireNonNull(get);
            return this;
        }

        public Builder setIamPolicy(String setIamPolicy) {
            this.setIamPolicy = Objects.requireNonNull(setIamPolicy);
            return this;
        }

        public Builder update(String update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }
        public MethodMapResponse build() {
            return new MethodMapResponse(create, delete, get, setIamPolicy, update);
        }
    }
}
