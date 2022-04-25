// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.MessageFilterType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 message filter for odata query.
 * 
 */
public final class X12MessageFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final X12MessageFilterArgs Empty = new X12MessageFilterArgs();

    /**
     * The message filter type.
     * 
     */
    @Import(name="messageFilterType", required=true)
    private Output<Either<String,MessageFilterType>> messageFilterType;

    /**
     * @return The message filter type.
     * 
     */
    public Output<Either<String,MessageFilterType>> messageFilterType() {
        return this.messageFilterType;
    }

    private X12MessageFilterArgs() {}

    private X12MessageFilterArgs(X12MessageFilterArgs $) {
        this.messageFilterType = $.messageFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12MessageFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12MessageFilterArgs $;

        public Builder() {
            $ = new X12MessageFilterArgs();
        }

        public Builder(X12MessageFilterArgs defaults) {
            $ = new X12MessageFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param messageFilterType The message filter type.
         * 
         * @return builder
         * 
         */
        public Builder messageFilterType(Output<Either<String,MessageFilterType>> messageFilterType) {
            $.messageFilterType = messageFilterType;
            return this;
        }

        /**
         * @param messageFilterType The message filter type.
         * 
         * @return builder
         * 
         */
        public Builder messageFilterType(Either<String,MessageFilterType> messageFilterType) {
            return messageFilterType(Output.of(messageFilterType));
        }

        /**
         * @param messageFilterType The message filter type.
         * 
         * @return builder
         * 
         */
        public Builder messageFilterType(String messageFilterType) {
            return messageFilterType(Either.ofLeft(messageFilterType));
        }

        /**
         * @param messageFilterType The message filter type.
         * 
         * @return builder
         * 
         */
        public Builder messageFilterType(MessageFilterType messageFilterType) {
            return messageFilterType(Either.ofRight(messageFilterType));
        }

        public X12MessageFilterArgs build() {
            $.messageFilterType = Objects.requireNonNull($.messageFilterType, "expected parameter 'messageFilterType' to be non-null");
            return $;
        }
    }

}
