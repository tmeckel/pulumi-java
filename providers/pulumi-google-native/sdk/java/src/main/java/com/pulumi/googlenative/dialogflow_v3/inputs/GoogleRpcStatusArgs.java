// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details. You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).
 * 
 */
public final class GoogleRpcStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleRpcStatusArgs Empty = new GoogleRpcStatusArgs();

    /**
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Integer> code;

    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    public Optional<Output<Integer>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    @Import(name="details")
    private @Nullable Output<List<Map<String,String>>> details;

    /**
     * @return A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    public Optional<Output<List<Map<String,String>>>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    private GoogleRpcStatusArgs() {}

    private GoogleRpcStatusArgs(GoogleRpcStatusArgs $) {
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleRpcStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleRpcStatusArgs $;

        public Builder() {
            $ = new GoogleRpcStatusArgs();
        }

        public Builder(GoogleRpcStatusArgs defaults) {
            $ = new GoogleRpcStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The status code, which should be an enum value of google.rpc.Code.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<Integer> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code The status code, which should be an enum value of google.rpc.Code.
         * 
         * @return builder
         * 
         */
        public Builder code(Integer code) {
            return code(Output.of(code));
        }

        /**
         * @param details A list of messages that carry the error details. There is a common set of message types for APIs to use.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<List<Map<String,String>>> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details A list of messages that carry the error details. There is a common set of message types for APIs to use.
         * 
         * @return builder
         * 
         */
        public Builder details(List<Map<String,String>> details) {
            return details(Output.of(details));
        }

        /**
         * @param details A list of messages that carry the error details. There is a common set of message types for APIs to use.
         * 
         * @return builder
         * 
         */
        public Builder details(Map<String,String>... details) {
            return details(List.of(details));
        }

        /**
         * @param message A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        public GoogleRpcStatusArgs build() {
            return $;
        }
    }

}
