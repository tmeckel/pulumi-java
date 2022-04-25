// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A transformation object, containing all information associated with the named transformation. All transformations are contained under a streaming job.
 * 
 */
public final class TransformationResponse extends com.pulumi.resources.InvokeArgs {

    public static final TransformationResponse Empty = new TransformationResponse();

    /**
     * The current entity tag for the transformation. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return The current entity tag for the transformation. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Resource name
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Resource name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the query that will be run in the streaming job. You can learn more about the Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="query")
    private @Nullable String query;

    /**
     * @return Specifies the query that will be run in the streaming job. You can learn more about the Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Specifies the number of streaming units that the streaming job uses.
     * 
     */
    @Import(name="streamingUnits")
    private @Nullable Integer streamingUnits;

    /**
     * @return Specifies the number of streaming units that the streaming job uses.
     * 
     */
    public Optional<Integer> streamingUnits() {
        return Optional.ofNullable(this.streamingUnits);
    }

    /**
     * Resource type
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    private TransformationResponse() {}

    private TransformationResponse(TransformationResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.query = $.query;
        this.streamingUnits = $.streamingUnits;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransformationResponse $;

        public Builder() {
            $ = new TransformationResponse();
        }

        public Builder(TransformationResponse defaults) {
            $ = new TransformationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag The current entity tag for the transformation. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Resource name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param query Specifies the query that will be run in the streaming job. You can learn more about the Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable String query) {
            $.query = query;
            return this;
        }

        /**
         * @param streamingUnits Specifies the number of streaming units that the streaming job uses.
         * 
         * @return builder
         * 
         */
        public Builder streamingUnits(@Nullable Integer streamingUnits) {
            $.streamingUnits = streamingUnits;
            return this;
        }

        /**
         * @param type Resource type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public TransformationResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
