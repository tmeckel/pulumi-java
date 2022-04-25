// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.BlobEventsTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.BlobTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.ChainingTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.CustomEventsTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.MultiplePipelineTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.RerunTumblingWindowTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.ScheduleTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.TumblingWindowTriggerResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTriggerResult {
    /**
     * @return Etag identifies change in the resource.
     * 
     */
    private final String etag;
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return Properties of the trigger.
     * 
     */
    private final Object properties;
    /**
     * @return The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTriggerResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Object properties,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Properties of the trigger.
     * 
     */
    public Object properties() {
        return this.properties;
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private Object properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTriggerResult build() {
            return new GetTriggerResult(etag, id, name, properties, type);
        }
    }
}
