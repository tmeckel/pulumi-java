// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Defines a particular step within a Cloud Dataflow job. A job consists of multiple steps, each of which performs some specific operation as part of the overall job. Data is typically passed from one step to another as part of the job. Here's an example of a sequence of steps which together implement a Map-Reduce job: * Read a collection of data from some source, parsing the collection's elements. * Validate the elements. * Apply a user-defined function to map each element to some value and extract an element-specific key value. * Group elements with the same key into a single element with that key, transforming a multiply-keyed collection into a uniquely-keyed collection. * Write the elements out to some data sink. Note that the Cloud Dataflow service may be used to run many different types of jobs, not just Map-Reduce.
 * 
 */
public final class StepResponse extends io.pulumi.resources.InvokeArgs {

    public static final StepResponse Empty = new StepResponse();

    /**
     * The kind of step in the Cloud Dataflow job.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The name that identifies the step. This must be unique for each step with respect to all other steps in the Cloud Dataflow job.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Named properties associated with the step. Each kind of predefined step has its own required set of properties. Must be provided on Create. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties;
    }

    public StepResponse(
        String kind,
        String name,
        Map<String,String> properties) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private StepResponse() {
        this.kind = null;
        this.name = null;
        this.properties = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(StepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public StepResponse build() {
            return new StepResponse(kind, name, properties);
        }
    }
}
