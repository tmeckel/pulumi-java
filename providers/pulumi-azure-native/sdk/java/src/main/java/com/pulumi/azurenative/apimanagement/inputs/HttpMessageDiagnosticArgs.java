// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.BodyDiagnosticSettingsArgs;
import com.pulumi.azurenative.apimanagement.inputs.DataMaskingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Http message diagnostic settings.
 * 
 */
public final class HttpMessageDiagnosticArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpMessageDiagnosticArgs Empty = new HttpMessageDiagnosticArgs();

    /**
     * Body logging settings.
     * 
     */
    @Import(name="body")
    private @Nullable Output<BodyDiagnosticSettingsArgs> body;

    /**
     * @return Body logging settings.
     * 
     */
    public Optional<Output<BodyDiagnosticSettingsArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Data masking settings.
     * 
     */
    @Import(name="dataMasking")
    private @Nullable Output<DataMaskingArgs> dataMasking;

    /**
     * @return Data masking settings.
     * 
     */
    public Optional<Output<DataMaskingArgs>> dataMasking() {
        return Optional.ofNullable(this.dataMasking);
    }

    /**
     * Array of HTTP Headers to log.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    /**
     * @return Array of HTTP Headers to log.
     * 
     */
    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    private HttpMessageDiagnosticArgs() {}

    private HttpMessageDiagnosticArgs(HttpMessageDiagnosticArgs $) {
        this.body = $.body;
        this.dataMasking = $.dataMasking;
        this.headers = $.headers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpMessageDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpMessageDiagnosticArgs $;

        public Builder() {
            $ = new HttpMessageDiagnosticArgs();
        }

        public Builder(HttpMessageDiagnosticArgs defaults) {
            $ = new HttpMessageDiagnosticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body Body logging settings.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<BodyDiagnosticSettingsArgs> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Body logging settings.
         * 
         * @return builder
         * 
         */
        public Builder body(BodyDiagnosticSettingsArgs body) {
            return body(Output.of(body));
        }

        /**
         * @param dataMasking Data masking settings.
         * 
         * @return builder
         * 
         */
        public Builder dataMasking(@Nullable Output<DataMaskingArgs> dataMasking) {
            $.dataMasking = dataMasking;
            return this;
        }

        /**
         * @param dataMasking Data masking settings.
         * 
         * @return builder
         * 
         */
        public Builder dataMasking(DataMaskingArgs dataMasking) {
            return dataMasking(Output.of(dataMasking));
        }

        /**
         * @param headers Array of HTTP Headers to log.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Array of HTTP Headers to log.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers Array of HTTP Headers to log.
         * 
         * @return builder
         * 
         */
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public HttpMessageDiagnosticArgs build() {
            return $;
        }
    }

}
