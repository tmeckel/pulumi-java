// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.BatchReleaseCriteriaResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The batch configuration properties definition.
 * 
 */
public final class BatchConfigurationPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final BatchConfigurationPropertiesResponse Empty = new BatchConfigurationPropertiesResponse();

    /**
     * The name of the batch group.
     * 
     */
    @Import(name="batchGroupName", required=true)
    private String batchGroupName;

    /**
     * @return The name of the batch group.
     * 
     */
    public String batchGroupName() {
        return this.batchGroupName;
    }

    /**
     * The artifact changed time.
     * 
     */
    @Import(name="changedTime")
    private @Nullable String changedTime;

    /**
     * @return The artifact changed time.
     * 
     */
    public Optional<String> changedTime() {
        return Optional.ofNullable(this.changedTime);
    }

    /**
     * The artifact creation time.
     * 
     */
    @Import(name="createdTime")
    private @Nullable String createdTime;

    /**
     * @return The artifact creation time.
     * 
     */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    @Import(name="metadata")
    private @Nullable Object metadata;

    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The batch release criteria.
     * 
     */
    @Import(name="releaseCriteria", required=true)
    private BatchReleaseCriteriaResponse releaseCriteria;

    /**
     * @return The batch release criteria.
     * 
     */
    public BatchReleaseCriteriaResponse releaseCriteria() {
        return this.releaseCriteria;
    }

    private BatchConfigurationPropertiesResponse() {}

    private BatchConfigurationPropertiesResponse(BatchConfigurationPropertiesResponse $) {
        this.batchGroupName = $.batchGroupName;
        this.changedTime = $.changedTime;
        this.createdTime = $.createdTime;
        this.metadata = $.metadata;
        this.releaseCriteria = $.releaseCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BatchConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BatchConfigurationPropertiesResponse $;

        public Builder() {
            $ = new BatchConfigurationPropertiesResponse();
        }

        public Builder(BatchConfigurationPropertiesResponse defaults) {
            $ = new BatchConfigurationPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchGroupName The name of the batch group.
         * 
         * @return builder
         * 
         */
        public Builder batchGroupName(String batchGroupName) {
            $.batchGroupName = batchGroupName;
            return this;
        }

        /**
         * @param changedTime The artifact changed time.
         * 
         * @return builder
         * 
         */
        public Builder changedTime(@Nullable String changedTime) {
            $.changedTime = changedTime;
            return this;
        }

        /**
         * @param createdTime The artifact creation time.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(@Nullable String createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        public Builder metadata(@Nullable Object metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param releaseCriteria The batch release criteria.
         * 
         * @return builder
         * 
         */
        public Builder releaseCriteria(BatchReleaseCriteriaResponse releaseCriteria) {
            $.releaseCriteria = releaseCriteria;
            return this;
        }

        public BatchConfigurationPropertiesResponse build() {
            $.batchGroupName = Objects.requireNonNull($.batchGroupName, "expected parameter 'batchGroupName' to be non-null");
            $.releaseCriteria = Objects.requireNonNull($.releaseCriteria, "expected parameter 'releaseCriteria' to be non-null");
            return $;
        }
    }

}
