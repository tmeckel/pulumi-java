// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1beta.enums.ErrorHandlerErrorCode;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom static error page to be served when an error occurs.
 * 
 */
public final class ErrorHandlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ErrorHandlerArgs Empty = new ErrorHandlerArgs();

    /**
     * Error condition this handler applies to.
     * 
     */
    @Import(name="errorCode")
    private @Nullable Output<ErrorHandlerErrorCode> errorCode;

    /**
     * @return Error condition this handler applies to.
     * 
     */
    public Optional<Output<ErrorHandlerErrorCode>> errorCode() {
        return Optional.ofNullable(this.errorCode);
    }

    /**
     * MIME type of file. Defaults to text/html.
     * 
     */
    @Import(name="mimeType")
    private @Nullable Output<String> mimeType;

    /**
     * @return MIME type of file. Defaults to text/html.
     * 
     */
    public Optional<Output<String>> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    /**
     * Static file content to be served for this error.
     * 
     */
    @Import(name="staticFile")
    private @Nullable Output<String> staticFile;

    /**
     * @return Static file content to be served for this error.
     * 
     */
    public Optional<Output<String>> staticFile() {
        return Optional.ofNullable(this.staticFile);
    }

    private ErrorHandlerArgs() {}

    private ErrorHandlerArgs(ErrorHandlerArgs $) {
        this.errorCode = $.errorCode;
        this.mimeType = $.mimeType;
        this.staticFile = $.staticFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErrorHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorHandlerArgs $;

        public Builder() {
            $ = new ErrorHandlerArgs();
        }

        public Builder(ErrorHandlerArgs defaults) {
            $ = new ErrorHandlerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param errorCode Error condition this handler applies to.
         * 
         * @return builder
         * 
         */
        public Builder errorCode(@Nullable Output<ErrorHandlerErrorCode> errorCode) {
            $.errorCode = errorCode;
            return this;
        }

        /**
         * @param errorCode Error condition this handler applies to.
         * 
         * @return builder
         * 
         */
        public Builder errorCode(ErrorHandlerErrorCode errorCode) {
            return errorCode(Output.of(errorCode));
        }

        /**
         * @param mimeType MIME type of file. Defaults to text/html.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(@Nullable Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType MIME type of file. Defaults to text/html.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        /**
         * @param staticFile Static file content to be served for this error.
         * 
         * @return builder
         * 
         */
        public Builder staticFile(@Nullable Output<String> staticFile) {
            $.staticFile = staticFile;
            return this;
        }

        /**
         * @param staticFile Static file content to be served for this error.
         * 
         * @return builder
         * 
         */
        public Builder staticFile(String staticFile) {
            return staticFile(Output.of(staticFile));
        }

        public ErrorHandlerArgs build() {
            return $;
        }
    }

}
