// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDirectoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDirectoryArgs Empty = new GetDirectoryArgs();

    /**
     * The ID of the directory.
     * 
     */
    @Import(name="directoryId", required=true)
    private String directoryId;

    /**
     * @return The ID of the directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }

    /**
     * A map of tags assigned to the directory/connector.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags assigned to the directory/connector.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDirectoryArgs() {}

    private GetDirectoryArgs(GetDirectoryArgs $) {
        this.directoryId = $.directoryId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDirectoryArgs $;

        public Builder() {
            $ = new GetDirectoryArgs();
        }

        public Builder(GetDirectoryArgs defaults) {
            $ = new GetDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryId The ID of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the directory/connector.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetDirectoryArgs build() {
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            return $;
        }
    }

}
