(defvar k-classes
  '("class" "assoc"))

(defvar k-varvaldef
  '("var" "val" "ef"))

(defvar k-keywords
  '("req" "type" "package" "import"))

(defvar k-types
  '("Int" "Char" "Real" "String" "Unit" "Bool"))

(defvar k-tab-width 4 "Width of a tab for K mode")

(defvar k-font-lock-defaults
  `((
     ;; stuff between "
     ("\\(--.*\\)" 1 'font-lock-comment-face)
     ("\\(==.*\\)" 1 'font-lock-comment-face)
     ("\"\\.\\*\\?" . font-lock-string-face)
     ;; ; : , ; { } =>  @ $ = are all special elements
     ;;(":\\|,\\|;\\|{\\|}\\|=>\\|@\\|$\\|=" . font-lock-keyword-face)
     ( ,(regexp-opt k-keywords 'words) . font-lock-builtin-face)
     ( ,(regexp-opt k-classes 'words) . font-lock-function-name-face)
     ( ,(regexp-opt k-varvaldef 'words) . font-lock-variable-name-face)
     ( ,(regexp-opt k-types 'words) . font-lock-type-face)
     )))

(define-derived-mode k-mode fundamental-mode "K script"
  "K mode is a major mode for editing K  files"
  
  (setq font-lock-defaults k-font-lock-defaults)
  
  (when k-tab-width
    (setq tab-width k-tab-width))

;;  (modify-syntax-entry ?# "< b" k-mode-syntax-table)
;;  (modify-syntax-entry ?\n "> b" k-mode-syntax-table)
  )

(provide 'k-mode)
