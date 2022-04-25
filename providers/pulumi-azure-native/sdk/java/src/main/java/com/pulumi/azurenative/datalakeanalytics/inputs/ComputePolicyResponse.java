// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Data Lake Analytics compute policy information.
 * 
 */
public final class ComputePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ComputePolicyResponse Empty = new ComputePolicyResponse();

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The maximum degree of parallelism per job this user can use to submit jobs.
     * 
     */
    @Import(name="maxDegreeOfParallelismPerJob", required=true)
    private Integer maxDegreeOfParallelismPerJob;

    /**
     * @return The maximum degree of parallelism per job this user can use to submit jobs.
     * 
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * The minimum priority per job this user can use to submit jobs.
     * 
     */
    @Import(name="minPriorityPerJob", required=true)
    private Integer minPriorityPerJob;

    /**
     * @return The minimum priority per job this user can use to submit jobs.
     * 
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The AAD object identifier for the entity to create a policy for.
     * 
     */
    @Import(name="objectId", required=true)
    private String objectId;

    /**
     * @return The AAD object identifier for the entity to create a policy for.
     * 
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * The type of AAD object the object identifier refers to.
     * 
     */
    @Import(name="objectType", required=true)
    private String objectType;

    /**
     * @return The type of AAD object the object identifier refers to.
     * 
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    private ComputePolicyResponse() {}

    private ComputePolicyResponse(ComputePolicyResponse $) {
        this.id = $.id;
        this.maxDegreeOfParallelismPerJob = $.maxDegreeOfParallelismPerJob;
        this.minPriorityPerJob = $.minPriorityPerJob;
        this.name = $.name;
        this.objectId = $.objectId;
        this.objectType = $.objectType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputePolicyResponse $;

        public Builder() {
            $ = new ComputePolicyResponse();
        }

        public Builder(ComputePolicyResponse defaults) {
            $ = new ComputePolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The resource identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param maxDegreeOfParallelismPerJob The maximum degree of parallelism per job this user can use to submit jobs.
         * 
         * @return builder
         * 
         */
        public Builder maxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
            $.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
            return this;
        }

        /**
         * @param minPriorityPerJob The minimum priority per job this user can use to submit jobs.
         * 
         * @return builder
         * 
         */
        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            $.minPriorityPerJob = minPriorityPerJob;
            return this;
        }

        /**
         * @param name The resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param objectId The AAD object identifier for the entity to create a policy for.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectType The type of AAD object the object identifier refers to.
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param type The resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ComputePolicyResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.maxDegreeOfParallelismPerJob = Objects.requireNonNull($.maxDegreeOfParallelismPerJob, "expected parameter 'maxDegreeOfParallelismPerJob' to be non-null");
            $.minPriorityPerJob = Objects.requireNonNull($.minPriorityPerJob, "expected parameter 'minPriorityPerJob' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
