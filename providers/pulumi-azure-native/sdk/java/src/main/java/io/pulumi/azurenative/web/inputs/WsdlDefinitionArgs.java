// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.WsdlImportMethod;
import io.pulumi.azurenative.web.inputs.WsdlServiceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The WSDL definition
 * 
 */
public final class WsdlDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WsdlDefinitionArgs Empty = new WsdlDefinitionArgs();

    /**
     * The WSDL content
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The WSDL import method
     * 
     */
    @InputImport(name="importMethod")
      private final @Nullable Input<Either<String,WsdlImportMethod>> importMethod;

    public Input<Either<String,WsdlImportMethod>> getImportMethod() {
        return this.importMethod == null ? Input.empty() : this.importMethod;
    }

    /**
     * The service with name and endpoint names
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<WsdlServiceArgs> service;

    public Input<WsdlServiceArgs> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * The WSDL URL
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public WsdlDefinitionArgs(
        @Nullable Input<String> content,
        @Nullable Input<Either<String,WsdlImportMethod>> importMethod,
        @Nullable Input<WsdlServiceArgs> service,
        @Nullable Input<String> url) {
        this.content = content;
        this.importMethod = importMethod;
        this.service = service;
        this.url = url;
    }

    private WsdlDefinitionArgs() {
        this.content = Input.empty();
        this.importMethod = Input.empty();
        this.service = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsdlDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<Either<String,WsdlImportMethod>> importMethod;
        private @Nullable Input<WsdlServiceArgs> service;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(WsdlDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.importMethod = defaults.importMethod;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        public Builder content(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder importMethod(@Nullable Input<Either<String,WsdlImportMethod>> importMethod) {
            this.importMethod = importMethod;
            return this;
        }

        public Builder importMethod(@Nullable Either<String,WsdlImportMethod> importMethod) {
            this.importMethod = Input.ofNullable(importMethod);
            return this;
        }

        public Builder service(@Nullable Input<WsdlServiceArgs> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable WsdlServiceArgs service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public WsdlDefinitionArgs build() {
            return new WsdlDefinitionArgs(content, importMethod, service, url);
        }
    }
}
