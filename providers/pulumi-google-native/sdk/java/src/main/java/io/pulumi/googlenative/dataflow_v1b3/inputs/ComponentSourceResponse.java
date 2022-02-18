// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Description of an interstitial value between transforms in an execution stage.
 * 
 */
public final class ComponentSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComponentSourceResponse Empty = new ComponentSourceResponse();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @InputImport(name="originalTransformOrCollection", required=true)
    private final String originalTransformOrCollection;

    public String getOriginalTransformOrCollection() {
        return this.originalTransformOrCollection;
    }

    /**
     * Human-readable name for this transform; may be user or system generated.
     * 
     */
    @InputImport(name="userName", required=true)
    private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public ComponentSourceResponse(
        String name,
        String originalTransformOrCollection,
        String userName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection, "expected parameter 'originalTransformOrCollection' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ComponentSourceResponse() {
        this.name = null;
        this.originalTransformOrCollection = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String originalTransformOrCollection;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransformOrCollection = defaults.originalTransformOrCollection;
    	      this.userName = defaults.userName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOriginalTransformOrCollection(String originalTransformOrCollection) {
            this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public ComponentSourceResponse build() {
            return new ComponentSourceResponse(name, originalTransformOrCollection, userName);
        }
    }
}
