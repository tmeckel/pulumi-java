// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MethodMapResponse {
    /**
     * The action identifier for the create method to be used for this collection
     * 
     */
    private final String create;
    /**
     * The action identifier for the delete method to be used for this collection
     * 
     */
    private final String delete;
    /**
     * The action identifier for the get method to be used for this collection
     * 
     */
    private final String get;
    /**
     * The action identifier for the setIamPolicy method to be used for this collection
     * 
     */
    private final String setIamPolicy;
    /**
     * The action identifier for the update method to be used for this collection
     * 
     */
    private final String update;

    @OutputCustomType.Constructor
    private MethodMapResponse(
        @OutputCustomType.Parameter("create") String create,
        @OutputCustomType.Parameter("delete") String delete,
        @OutputCustomType.Parameter("get") String get,
        @OutputCustomType.Parameter("setIamPolicy") String setIamPolicy,
        @OutputCustomType.Parameter("update") String update) {
        this.create = create;
        this.delete = delete;
        this.get = get;
        this.setIamPolicy = setIamPolicy;
        this.update = update;
    }

    /**
     * The action identifier for the create method to be used for this collection
     * 
    */
    public String getCreate() {
        return this.create;
    }
    /**
     * The action identifier for the delete method to be used for this collection
     * 
    */
    public String getDelete() {
        return this.delete;
    }
    /**
     * The action identifier for the get method to be used for this collection
     * 
    */
    public String getGet() {
        return this.get;
    }
    /**
     * The action identifier for the setIamPolicy method to be used for this collection
     * 
    */
    public String getSetIamPolicy() {
        return this.setIamPolicy;
    }
    /**
     * The action identifier for the update method to be used for this collection
     * 
    */
    public String getUpdate() {
        return this.update;
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
