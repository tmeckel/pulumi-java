// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Description of an interstitial value between transforms in an execution stage.
 * 
 */
public final class ComponentSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ComponentSourceResponse Empty = new ComponentSourceResponse();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Dataflow service generated name for this source.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @Import(name="originalTransformOrCollection", required=true)
    private String originalTransformOrCollection;

    /**
     * @return User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    public String originalTransformOrCollection() {
        return this.originalTransformOrCollection;
    }

    /**
     * Human-readable name for this transform; may be user or system generated.
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    /**
     * @return Human-readable name for this transform; may be user or system generated.
     * 
     */
    public String userName() {
        return this.userName;
    }

    private ComponentSourceResponse() {}

    private ComponentSourceResponse(ComponentSourceResponse $) {
        this.name = $.name;
        this.originalTransformOrCollection = $.originalTransformOrCollection;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentSourceResponse $;

        public Builder() {
            $ = new ComponentSourceResponse();
        }

        public Builder(ComponentSourceResponse defaults) {
            $ = new ComponentSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Dataflow service generated name for this source.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param originalTransformOrCollection User name for the original user transform or collection with which this source is most closely associated.
         * 
         * @return builder
         * 
         */
        public Builder originalTransformOrCollection(String originalTransformOrCollection) {
            $.originalTransformOrCollection = originalTransformOrCollection;
            return this;
        }

        /**
         * @param userName Human-readable name for this transform; may be user or system generated.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public ComponentSourceResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.originalTransformOrCollection = Objects.requireNonNull($.originalTransformOrCollection, "expected parameter 'originalTransformOrCollection' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
