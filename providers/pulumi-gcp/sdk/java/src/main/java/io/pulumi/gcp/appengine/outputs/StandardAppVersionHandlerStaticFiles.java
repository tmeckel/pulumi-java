// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StandardAppVersionHandlerStaticFiles {
    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as
     * static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged
     * against both your code and static data storage resource quotas.
     * 
     */
    private final @Nullable Boolean applicationReadable;
    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example "3.5s".
     * 
     */
    private final @Nullable String expiration;
    /**
     * HTTP headers to use for all responses from these URLs.
     * An object containing a list of "key:value" value pairs.".
     * 
     */
    private final @Nullable Map<String,String> httpHeaders;
    /**
     * MIME type used to serve all files served by this handler.
     * Defaults to file-specific MIME types, which are derived from each file's filename extension.
     * 
     */
    private final @Nullable String mimeType;
    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    private final @Nullable String path;
    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    private final @Nullable Boolean requireMatchingFile;
    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    private final @Nullable String uploadPathRegex;

    @OutputCustomType.Constructor
    private StandardAppVersionHandlerStaticFiles(
        @OutputCustomType.Parameter("applicationReadable") @Nullable Boolean applicationReadable,
        @OutputCustomType.Parameter("expiration") @Nullable String expiration,
        @OutputCustomType.Parameter("httpHeaders") @Nullable Map<String,String> httpHeaders,
        @OutputCustomType.Parameter("mimeType") @Nullable String mimeType,
        @OutputCustomType.Parameter("path") @Nullable String path,
        @OutputCustomType.Parameter("requireMatchingFile") @Nullable Boolean requireMatchingFile,
        @OutputCustomType.Parameter("uploadPathRegex") @Nullable String uploadPathRegex) {
        this.applicationReadable = applicationReadable;
        this.expiration = expiration;
        this.httpHeaders = httpHeaders;
        this.mimeType = mimeType;
        this.path = path;
        this.requireMatchingFile = requireMatchingFile;
        this.uploadPathRegex = uploadPathRegex;
    }

    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as
     * static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged
     * against both your code and static data storage resource quotas.
     * 
    */
    public Optional<Boolean> getApplicationReadable() {
        return Optional.ofNullable(this.applicationReadable);
    }
    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example "3.5s".
     * 
    */
    public Optional<String> getExpiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * HTTP headers to use for all responses from these URLs.
     * An object containing a list of "key:value" value pairs.".
     * 
    */
    public Map<String,String> getHttpHeaders() {
        return this.httpHeaders == null ? Map.of() : this.httpHeaders;
    }
    /**
     * MIME type used to serve all files served by this handler.
     * Defaults to file-specific MIME types, which are derived from each file's filename extension.
     * 
    */
    public Optional<String> getMimeType() {
        return Optional.ofNullable(this.mimeType);
    }
    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
    */
    public Optional<Boolean> getRequireMatchingFile() {
        return Optional.ofNullable(this.requireMatchingFile);
    }
    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
    */
    public Optional<String> getUploadPathRegex() {
        return Optional.ofNullable(this.uploadPathRegex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionHandlerStaticFiles defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean applicationReadable;
        private @Nullable String expiration;
        private @Nullable Map<String,String> httpHeaders;
        private @Nullable String mimeType;
        private @Nullable String path;
        private @Nullable Boolean requireMatchingFile;
        private @Nullable String uploadPathRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionHandlerStaticFiles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationReadable = defaults.applicationReadable;
    	      this.expiration = defaults.expiration;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.mimeType = defaults.mimeType;
    	      this.path = defaults.path;
    	      this.requireMatchingFile = defaults.requireMatchingFile;
    	      this.uploadPathRegex = defaults.uploadPathRegex;
        }

        public Builder applicationReadable(@Nullable Boolean applicationReadable) {
            this.applicationReadable = applicationReadable;
            return this;
        }

        public Builder expiration(@Nullable String expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder httpHeaders(@Nullable Map<String,String> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder requireMatchingFile(@Nullable Boolean requireMatchingFile) {
            this.requireMatchingFile = requireMatchingFile;
            return this;
        }

        public Builder uploadPathRegex(@Nullable String uploadPathRegex) {
            this.uploadPathRegex = uploadPathRegex;
            return this;
        }
        public StandardAppVersionHandlerStaticFiles build() {
            return new StandardAppVersionHandlerStaticFiles(applicationReadable, expiration, httpHeaders, mimeType, path, requireMatchingFile, uploadPathRegex);
        }
    }
}
